package roomlibrarydemo.roomlibrarydemo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Ishaq Hassan on 11/12/2017.
 */
@Database(entities = {Contact.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ContactDataAccess contacts();
}
