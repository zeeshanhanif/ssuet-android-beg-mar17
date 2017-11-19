package httprequestdemoone.firebasedemo1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ishaq Hassan on 11/19/2017.
 */

public class ContactsListAdapter extends ArrayAdapter<Contact> {
    ArrayList<Contact> contacts;
    ContactItemListner contactItemListner;
    public ContactsListAdapter(@NonNull Context context,ArrayList<Contact> contacts,ContactItemListner contactItemListner) {
        super(context, 0,contacts);
        this.contacts = contacts;
        this.contactItemListner = contactItemListner;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item,parent,false);
        }
        final Contact contact = contacts.get(position);
        TextView nameTv = convertView.findViewById(R.id.contactNameTv);
        TextView phoneTv = convertView.findViewById(R.id.contactPhoneTv);
        Button contactEditBtn = convertView.findViewById(R.id.contactEditBtn);
        Button contactDelBtn = convertView.findViewById(R.id.contactDelBtn);

        contactEditBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactItemListner.onUpdate(contact);
            }
        });
        contactDelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactItemListner.onDelete(contact);
            }
        });

        nameTv.setText(contact.getName());
        phoneTv.setText(contact.getPhone());
        return convertView;
    }
}
