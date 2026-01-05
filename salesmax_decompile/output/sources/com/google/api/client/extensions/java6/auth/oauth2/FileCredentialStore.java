package com.google.api.client.extensions.java6.auth.oauth2;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialStore;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.FileDataStoreFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

@Beta
@Deprecated
/* loaded from: classes3.dex */
public class FileCredentialStore implements CredentialStore {
    private static final boolean IS_WINDOWS;
    private static final Logger LOGGER = Logger.getLogger(FileCredentialStore.class.getName());
    private final File file;
    private final JsonFactory jsonFactory;
    private final Lock lock = new ReentrantLock();
    private FilePersistedCredentials credentials = new FilePersistedCredentials();

    static {
        IS_WINDOWS = File.separatorChar == '\\';
    }

    public FileCredentialStore(File file, JsonFactory jsonFactory) throws IOException {
        this.file = (File) Preconditions.checkNotNull(file);
        this.jsonFactory = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            String strValueOf = String.valueOf(parentFile);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 35);
            sb.append("unable to create parent directory: ");
            sb.append(strValueOf);
            throw new IOException(sb.toString());
        }
        if (isSymbolicLink(file)) {
            String strValueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 31);
            sb2.append("unable to use a symbolic link: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (!file.createNewFile()) {
            loadCredentials(file);
            return;
        }
        if (!file.setReadable(false, false) || !file.setWritable(false, false) || !file.setExecutable(false, false)) {
            Logger logger = LOGGER;
            String strValueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 49);
            sb3.append("unable to change file permissions for everybody: ");
            sb3.append(strValueOf3);
            logger.warning(sb3.toString());
        }
        if (file.setReadable(true) && file.setWritable(true)) {
            save();
            return;
        }
        String strValueOf4 = String.valueOf(file);
        StringBuilder sb4 = new StringBuilder(strValueOf4.length() + 32);
        sb4.append("unable to set file permissions: ");
        sb4.append(strValueOf4);
        throw new IOException(sb4.toString());
    }

    private void loadCredentials(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            this.credentials = (FilePersistedCredentials) this.jsonFactory.fromInputStream(fileInputStream, FilePersistedCredentials.class);
        } finally {
            fileInputStream.close();
        }
    }

    private void save() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        try {
            JsonGenerator jsonGeneratorCreateJsonGenerator = this.jsonFactory.createJsonGenerator(fileOutputStream, Charsets.UTF_8);
            jsonGeneratorCreateJsonGenerator.serialize(this.credentials);
            jsonGeneratorCreateJsonGenerator.close();
        } finally {
            fileOutputStream.close();
        }
    }

    @Override // com.google.api.client.auth.oauth2.CredentialStore
    public void delete(String str, Credential credential) {
        this.lock.lock();
        try {
            this.credentials.delete(str);
            save();
        } finally {
            this.lock.unlock();
        }
    }

    public boolean isSymbolicLink(File file) {
        if (IS_WINDOWS) {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    @Override // com.google.api.client.auth.oauth2.CredentialStore
    public boolean load(String str, Credential credential) {
        this.lock.lock();
        try {
            return this.credentials.load(str, credential);
        } finally {
            this.lock.unlock();
        }
    }

    public final void migrateTo(FileDataStoreFactory fileDataStoreFactory) {
        migrateTo(StoredCredential.getDefaultDataStore(fileDataStoreFactory));
    }

    @Override // com.google.api.client.auth.oauth2.CredentialStore
    public void store(String str, Credential credential) {
        this.lock.lock();
        try {
            this.credentials.store(str, credential);
            save();
        } finally {
            this.lock.unlock();
        }
    }

    public final void migrateTo(DataStore<StoredCredential> dataStore) {
        this.credentials.migrateTo(dataStore);
    }
}
