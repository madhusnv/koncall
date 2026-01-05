package p001o;

import android.content.Context;
import com.facebook.C10773c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import p001o.tk0;
import p001o.ua;

/* loaded from: classes5.dex */
public final class vk0 {

    /* renamed from: a */
    public static final vk0 f50459a = new vk0();

    /* renamed from: b */
    public static final String f50460b = vk0.class.getName();

    /* renamed from: o.vk0$a */
    public static final class C17604a extends ObjectInputStream {

        /* renamed from: a */
        public static final a f50461a = new a(null);

        /* renamed from: o.vk0$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C17604a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (sq8.m48644c(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(ua.C17344b.class);
            } else if (sq8.m48644c(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(tk0.C17147b.class);
            }
            sq8.m48648g(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x006d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {, blocks: (B:4:0x0003, B:8:0x002b, B:9:0x002e, B:28:0x0066, B:15:0x003e, B:16:0x0041, B:17:0x004a, B:19:0x004c, B:20:0x004f, B:21:0x0055, B:24:0x005a, B:25:0x005d), top: B:45:0x0003 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized m4d m52895a() {
        m4d m4dVar;
        C17604a c17604a;
        Throwable th;
        File fileStreamPath;
        gl0.m28968b();
        Context contextM13019l = C10773c.m13019l();
        m4dVar = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextM13019l.openFileInput("AppEventsLogger.persistedevents");
                sq8.m48648g(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                c17604a = new C17604a(new BufferedInputStream(fileInputStreamOpenFileInput));
            } catch (Exception unused) {
            }
        } catch (FileNotFoundException unused2) {
            c17604a = null;
        } catch (Exception unused3) {
            c17604a = null;
        } catch (Throwable th2) {
            c17604a = null;
            th = th2;
        }
        try {
            Object object = c17604a.readObject();
            sq8.m48647f(object, "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
            m4d m4dVar2 = (m4d) object;
            cri.m21664j(c17604a);
            try {
                contextM13019l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused4) {
            }
            m4dVar = m4dVar2;
        } catch (FileNotFoundException unused5) {
            cri.m21664j(c17604a);
            fileStreamPath = contextM13019l.getFileStreamPath("AppEventsLogger.persistedevents");
            fileStreamPath.delete();
            if (m4dVar == null) {
            }
            return m4dVar;
        } catch (Exception unused6) {
            cri.m21664j(c17604a);
            fileStreamPath = contextM13019l.getFileStreamPath("AppEventsLogger.persistedevents");
            fileStreamPath.delete();
            if (m4dVar == null) {
            }
            return m4dVar;
        } catch (Throwable th3) {
            th = th3;
            cri.m21664j(c17604a);
            try {
                contextM13019l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused7) {
            }
            throw th;
        }
        if (m4dVar == null) {
            m4dVar = new m4d();
        }
        return m4dVar;
    }

    /* renamed from: b */
    public static final void m52896b(m4d m4dVar) throws IOException {
        Context contextM13019l = C10773c.m13019l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(contextM13019l.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(m4dVar);
                cri.m21664j(objectOutputStream2);
            } catch (Throwable unused) {
                objectOutputStream = objectOutputStream2;
                try {
                    contextM13019l.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    cri.m21664j(objectOutputStream);
                    throw th;
                }
                cri.m21664j(objectOutputStream);
            }
        } catch (Throwable unused3) {
        }
    }
}
