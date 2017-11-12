package roomlibrarydemo.roomlibrarydemo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Ishaq Hassan on 11/12/2017.
 */
@Dao
public interface ContactDataAccess {
    @Insert
    void insertContact(Contact contact);

    @Update
    void updateContact(Contact contact);

    @Delete
    void deleteContact(Contact contact);

    @Query("SELECT * FROM contacts")
    List<Contact> selectAllContacts();

    @Query("SELECT * FROM contacts WHERE id = :myId LIMIT 1")
    Contact getContactById(int myId);

}
