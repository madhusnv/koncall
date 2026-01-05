package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import p001o.e9g;
import p001o.f9g;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class Room {
    private static final String CURSOR_CONV_SUFFIX = "_CursorConverter";
    public static final Room INSTANCE = new Room();
    public static final String LOG_TAG = "ROOM";
    public static final String MASTER_TABLE_NAME = "room_master_table";

    private Room() {
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> cls, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(cls, "klass");
        if (true ^ (str == null || f9g.d0(str))) {
            return new RoomDatabase.Builder<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }

    public static final <T, C> T getGeneratedImplementation(Class<C> cls, String str) throws ClassNotFoundException {
        String str2;
        sq8.m48649h(cls, "klass");
        sq8.m48649h(str, "suffix");
        Package r0 = cls.getPackage();
        sq8.m48646e(r0);
        String name = r0.getName();
        String canonicalName = cls.getCanonicalName();
        sq8.m48646e(canonicalName);
        sq8.m48648g(name, "fullPackage");
        if (!(name.length() == 0)) {
            canonicalName = canonicalName.substring(name.length() + 1);
            sq8.m48648g(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = e9g.m24592F(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            sq8.m48647f(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static final <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        sq8.m48649h(context, "context");
        sq8.m48649h(cls, "klass");
        return new RoomDatabase.Builder<>(context, cls, null);
    }
}
