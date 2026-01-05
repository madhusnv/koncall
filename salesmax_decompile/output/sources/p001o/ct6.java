package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public final class ct6 {

    /* renamed from: a */
    public static final ct6 f18612a = new ct6();

    /* renamed from: a */
    public final Object m21746a(String str, ClassLoader classLoader, Class cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final List m21747b(Class cls, ClassLoader classLoader) {
        try {
            return m21749d(cls, classLoader);
        } catch (Throwable unused) {
            return kh3.Q0(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: c */
    public final List m21748c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!dt6.m23782a()) {
            return m21747b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("o.ge0", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return m21747b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return m21747b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final List m21749d(Class cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        sq8.m48648g(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hh3.m30441A(arrayList, f18612a.m21750e((URL) it.next()));
        }
        Set setV0 = kh3.V0(arrayList);
        if (!(!setV0.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        Set set = setV0;
        ArrayList arrayList2 = new ArrayList(dh3.m23088v(set, 10));
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f18612a.m21746a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final List m21750e(URL url) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!e9g.m24597K(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
            try {
                List listM21751f = f18612a.m21751f(bufferedReader);
                tb3.m49666a(bufferedReader, null);
                return listM21751f;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String strU0 = f9g.U0(f9g.P0(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strP0 = f9g.P0(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strU0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strP0)), HTTP.UTF_8));
            try {
                List listM21751f2 = f18612a.m21751f(bufferedReader);
                tb3.m49666a(bufferedReader, null);
                jarFile.close();
                return listM21751f2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    cl6.m21376a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    public final List m21751f(BufferedReader bufferedReader) throws IOException {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return kh3.Q0(linkedHashSet);
            }
            String string = f9g.Z0(f9g.V0(line, ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, null, 2, null)).toString();
            int i = 0;
            while (true) {
                if (i >= string.length()) {
                    z = true;
                    break;
                }
                char cCharAt = string.charAt(i);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }
}
