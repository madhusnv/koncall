package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p001o.bce;
import p001o.leg;
import p001o.meg;
import p001o.ok7;
import p001o.rid;
import p001o.sq8;
import p001o.tb3;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class SQLiteCopyOpenHelper implements meg, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final meg delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i, meg megVar) {
        sq8.m48649h(context, "context");
        sq8.m48649h(megVar, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = megVar;
    }

    private final void copyDatabaseFile(File file, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            sq8.m48648g(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            sq8.m48648g(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                sq8.m48648g(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        sq8.m48648g(channel, "output");
        FileUtil.copy(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        sq8.m48648g(fileCreateTempFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, z);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final meg createFrameworkOpenHelper(File file) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            final int version = DBUtil.readVersion(file);
            ok7 ok7Var = new ok7();
            meg.C15302b.a aVarM38860d = meg.C15302b.f35294f.m38862a(this.context).m38860d(file.getAbsolutePath());
            final int iM18601d = bce.m18601d(version, 1);
            return ok7Var.create(aVarM38860d.m38859c(new meg.AbstractC15301a(iM18601d) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // p001o.meg.AbstractC15301a
                public void onCreate(leg legVar) {
                    sq8.m48649h(legVar, "db");
                }

                @Override // p001o.meg.AbstractC15301a
                public void onOpen(leg legVar) {
                    sq8.m48649h(legVar, "db");
                    int i = version;
                    if (i < 1) {
                        legVar.setVersion(i);
                    }
                }

                @Override // p001o.meg.AbstractC15301a
                public void onUpgrade(leg legVar, int i, int i2) {
                    sq8.m48649h(legVar, "db");
                }
            }).m38858b());
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            sq8.m48667z("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        meg megVarCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            leg writableDatabase = z ? megVarCreateFrameworkOpenHelper.getWritableDatabase() : megVarCreateFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                sq8.m48667z("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            sq8.m48646e(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            y3i y3iVar = y3i.f54824a;
            tb3.m49666a(megVarCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            sq8.m48667z("databaseConfiguration");
            databaseConfiguration = null;
        }
        rid ridVar = new rid(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            rid.m46831c(ridVar, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    sq8.m48648g(databasePath, "databaseFile");
                    copyDatabaseFile(databasePath, z);
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                sq8.m48648g(databasePath, "databaseFile");
                int version = DBUtil.readVersion(databasePath);
                if (version == this.databaseVersion) {
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    sq8.m48667z("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databasePath, z);
                    } catch (IOException unused) {
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete database file (");
                    sb.append(databaseName);
                    sb.append(") for a copy destructive migration.");
                }
            } catch (IOException unused2) {
            }
        } finally {
            ridVar.m46833d();
        }
    }

    @Override // p001o.meg, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // p001o.meg
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public meg getDelegate() {
        return this.delegate;
    }

    @Override // p001o.meg
    public leg getReadableDatabase() throws IOException {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // p001o.meg
    public leg getWritableDatabase() throws IOException {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        sq8.m48649h(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // p001o.meg
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
