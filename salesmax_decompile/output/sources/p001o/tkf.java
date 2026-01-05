package p001o;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public class tkf extends ClassLoader {

    /* renamed from: l */
    public static final ConcurrentMap f47341l = new ConcurrentHashMap();

    /* renamed from: m */
    public static final Map f47342m = new WeakHashMap();

    /* renamed from: n */
    public static final Map f47343n = new WeakHashMap();

    /* renamed from: a */
    public final String f47344a;

    /* renamed from: b */
    public final File f47345b;

    /* renamed from: c */
    public final int f47346c;

    /* renamed from: d */
    public final List f47347d;

    /* renamed from: e */
    public final String f47348e;

    /* renamed from: f */
    public final List f47349f;

    /* renamed from: g */
    public final List f47350g;

    /* renamed from: h */
    public final Set f47351h;

    /* renamed from: i */
    public final Map f47352i;

    /* renamed from: j */
    public Map f47353j;

    /* renamed from: k */
    public Map f47354k;

    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tkf(ClassLoader classLoader, String str, String str2, List list, List list2) {
        super(classLoader);
        this.f47347d = new ArrayList();
        this.f47349f = new ArrayList();
        this.f47350g = new ArrayList();
        this.f47351h = Collections.newSetFromMap(new IdentityHashMap());
        this.f47352i = new HashMap();
        this.f47353j = new HashMap();
        this.f47354k = new HashMap();
        this.f47348e = str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strReplace = ((String) it.next()).replace(".", "/");
                if (!strReplace.endsWith("/")) {
                    strReplace = strReplace + "/";
                }
                this.f47349f.add(strReplace);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                this.f47350g.add((String) it2.next());
            }
        }
        if (str2 != null) {
            this.f47344a = str2;
            this.f47346c = str2.length();
        } else {
            URL resource = tkf.class.getResource("ShadowClassLoader.class");
            String string = resource == null ? null : resource.toString();
            if (string == null || !string.endsWith("lombok/launch/ShadowClassLoader.class")) {
                ClassLoader classLoader2 = tkf.class.getClassLoader();
                StringBuilder sb = new StringBuilder("ShadowLoader can't find itself. SCL loader type: ");
                sb.append(classLoader2 == null ? "*NULL*" : classLoader2.getClass().toString());
                throw new RuntimeException(sb.toString());
            }
            int length = string.length() - 37;
            this.f47346c = length;
            this.f47344a = m50128o(string.substring(0, length));
        }
        if (this.f47344a.startsWith("jar:file:") && this.f47344a.endsWith("!/")) {
            this.f47345b = new File(this.f47344a.substring(9, r6.length() - 2));
        } else if (this.f47344a.startsWith("file:")) {
            this.f47345b = new File(this.f47344a.substring(5));
        } else {
            this.f47345b = new File(this.f47344a);
        }
        String property = System.getProperty("shadow.override." + str);
        if (property == null || property.isEmpty()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("\\s*");
        sb2.append(File.pathSeparatorChar == ';' ? ";" : ":");
        sb2.append("\\s*");
        for (String str3 : property.split(sb2.toString())) {
            if (!str3.endsWith("/*")) {
                if (str3.endsWith(String.valueOf(File.separator) + "*")) {
                    m50130b(str3.substring(0, str3.length() - 2));
                } else {
                    m50129a(str3);
                }
            }
        }
    }

    /* renamed from: n */
    public static boolean m50127n(InputStream inputStream, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, HTTP.UTF_8));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return false;
            }
            String strTrim = line.trim();
            if (!strTrim.isEmpty() && strTrim.charAt(0) != '#' && strTrim.equals(str)) {
                return true;
            }
        }
    }

    /* renamed from: o */
    public static String m50128o(String str) {
        try {
            return URLDecoder.decode(str.replaceAll("\\+", "%2B"), HTTP.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            throw new InternalError("UTF-8 not supported");
        }
    }

    /* renamed from: a */
    public void m50129a(String str) {
        this.f47347d.add(new File(str));
    }

    /* renamed from: b */
    public void m50130b(String str) {
        for (File file : new File(str).listFiles()) {
            if (file.getName().toLowerCase().endsWith(".jar") && file.canRead() && file.isFile()) {
                this.f47347d.add(file);
            }
        }
    }

    /* renamed from: c */
    public final boolean m50131c(String str) {
        Iterator it = this.f47349f.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Set m50132d(String str) throws IOException {
        try {
            JarFile jarFile = new JarFile(str);
            int iHighestOneBit = Integer.highestOneBit(jarFile.size());
            if (iHighestOneBit != jarFile.size()) {
                iHighestOneBit <<= 1;
            }
            if (iHighestOneBit == 0) {
                iHighestOneBit = 1;
            }
            HashSet hashSet = new HashSet(iHighestOneBit >> 1, 2);
            try {
                Enumeration<JarEntry> enumerationEntries = jarFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    if (!jarEntryNextElement.isDirectory()) {
                        hashSet.add(jarEntryNextElement.getName());
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                jarFile.close();
                throw th;
            }
            jarFile.close();
            return hashSet;
        } catch (Exception unused2) {
            return Collections.emptySet();
        }
    }

    /* renamed from: e */
    public final Set m50133e(String str) {
        Map map = f47342m;
        synchronized (map) {
            Object obj = this.f47352i.get(str);
            if (obj != null) {
                return (Set) f47343n.get(obj);
            }
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getValue()).equals(str)) {
                    Object key = entry.getKey();
                    this.f47352i.put(str, key);
                    return (Set) f47343n.get(key);
                }
            }
            Object obj2 = new Object();
            Set setM50132d = m50132d(str);
            f47343n.put(obj2, setM50132d);
            f47342m.put(obj2, str);
            this.f47352i.put(str, obj2);
            return setM50132d;
        }
    }

    /* renamed from: f */
    public final URL m50134f(String str, String str2, File file) throws IOException {
        File absoluteFile;
        File file2;
        if (file.isDirectory()) {
            if (str2 != null) {
                try {
                    File file3 = new File(file, str2);
                    if (file3.isFile() && file3.canRead()) {
                        return file3.toURI().toURL();
                    }
                    file2 = new File(file, str);
                    if (file2.isFile() && file2.canRead()) {
                        return file2.toURI().toURL();
                    }
                } catch (MalformedURLException unused) {
                }
            } else {
                file2 = new File(file, str);
                if (file2.isFile()) {
                    return file2.toURI().toURL();
                }
            }
            return null;
        }
        if (file.isFile() && file.canRead()) {
            try {
                absoluteFile = file.getCanonicalFile();
            } catch (Exception unused2) {
                absoluteFile = file.getAbsoluteFile();
            }
            Set setM50133e = m50133e(absoluteFile.getAbsolutePath());
            String string = absoluteFile.toURI().toString();
            try {
                if (setM50133e.contains(str2)) {
                    return new URI("jar:" + string + "!/" + str2).toURL();
                }
            } catch (Exception unused3) {
            }
            try {
                if (setM50133e.contains(str)) {
                    return new URI("jar:" + string + "!/" + str).toURL();
                }
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    /* renamed from: g */
    public final URL m50135g(String str) throws IOException {
        URL resource = super.getResource(str);
        if (resource == null) {
            return null;
        }
        if (!m50141m(resource.toString(), str)) {
            return resource;
        }
        Enumeration<URL> resources = super.getResources(str);
        while (resources.hasMoreElements()) {
            URL urlNextElement = resources.nextElement();
            if (!m50141m(urlNextElement.toString(), str)) {
                return urlNextElement;
            }
        }
        return null;
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        return m50136h(str, false);
    }

    @Override // java.lang.ClassLoader
    public Enumeration getResources(String str) throws IOException {
        String str2;
        URL urlM50134f;
        if (str.endsWith(".class")) {
            str2 = String.valueOf(str.substring(0, str.length() - 6)) + ".SCL." + this.f47348e;
        } else {
            str2 = null;
        }
        Vector vector = new Vector();
        Iterator it = this.f47347d.iterator();
        while (it.hasNext()) {
            URL urlM50134f2 = m50134f(str, str2, (File) it.next());
            if (urlM50134f2 != null) {
                vector.add(urlM50134f2);
            }
        }
        if (this.f47347d.isEmpty() && (urlM50134f = m50134f(str, str2, this.f47345b)) != null) {
            vector.add(urlM50134f);
        }
        Enumeration<URL> resources = super.getResources(str);
        while (resources.hasMoreElements()) {
            URL urlNextElement = resources.nextElement();
            if (m50138j(urlNextElement.toString(), str, this.f47348e)) {
                vector.add(urlNextElement);
            }
        }
        if (str2 != null) {
            Enumeration<URL> resources2 = super.getResources(str2);
            while (resources2.hasMoreElements()) {
                URL urlNextElement2 = resources2.nextElement();
                if (m50138j(urlNextElement2.toString(), str2, this.f47348e)) {
                    vector.add(urlNextElement2);
                }
            }
        }
        return vector.elements();
    }

    /* renamed from: h */
    public final URL m50136h(String str, boolean z) throws IOException {
        String str2;
        URL resource;
        if (str.endsWith(".class")) {
            str2 = String.valueOf(str.substring(0, str.length() - 6)) + ".SCL." + this.f47348e;
        } else {
            str2 = null;
        }
        Iterator it = this.f47347d.iterator();
        while (it.hasNext()) {
            URL urlM50134f = m50134f(str, str2, (File) it.next());
            if (urlM50134f != null) {
                return urlM50134f;
            }
        }
        if (!this.f47347d.isEmpty()) {
            if (z) {
                return null;
            }
            if (str2 != null) {
                try {
                    URL urlM50135g = m50135g(str2);
                    if (urlM50135g != null) {
                        return urlM50135g;
                    }
                } catch (IOException unused) {
                }
            }
            try {
                return m50135g(str);
            } catch (IOException unused2) {
                return null;
            }
        }
        URL urlM50134f2 = m50134f(str, str2, this.f47345b);
        if (urlM50134f2 != null) {
            return urlM50134f2;
        }
        if (str2 != null && (resource = super.getResource(str2)) != null && (!z || m50141m(resource.toString(), str2))) {
            return resource;
        }
        URL resource2 = super.getResource(str);
        if (resource2 == null || (z && !m50141m(resource2.toString(), str))) {
            return null;
        }
        return resource2;
    }

    /* renamed from: i */
    public final boolean m50137i(String str, String str2) {
        return str != null && str.length() == this.f47346c + str2.length() && this.f47344a.regionMatches(0, str, 0, this.f47346c);
    }

    /* renamed from: j */
    public final boolean m50138j(String str, String str2, String str3) {
        int iIndexOf;
        if (str == null) {
            return false;
        }
        if (!str.startsWith("file:/")) {
            if (!str.startsWith("jar:") || (iIndexOf = str.indexOf(33)) == -1) {
                return false;
            }
            return m50140l(str.substring(4, iIndexOf), str3);
        }
        String strM50128o = m50128o(str.substring(5));
        if (strM50128o.length() > str2.length() && strM50128o.endsWith(str2) && strM50128o.charAt((strM50128o.length() - str2.length()) - 1) == '/') {
            return m50139k(strM50128o.substring(0, (strM50128o.length() - str2.length()) - 1), str3);
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m50139k(String str, String str2) throws IOException {
        String str3 = String.valueOf(str) + "::" + str2;
        Boolean bool = (Boolean) this.f47353j.get(str3);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(String.valueOf(str) + "/META-INF/ShadowClassLoader"));
            try {
                boolean zM50127n = m50127n(fileInputStream, str2);
                this.f47353j.put(str3, Boolean.valueOf(zM50127n));
                return zM50127n;
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException unused) {
            this.f47353j.put(str3, Boolean.FALSE);
            return false;
        } catch (IOException unused2) {
            this.f47353j.put(str3, Boolean.FALSE);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m50140l(String str, String str2) throws IOException {
        ZipEntry nextEntry;
        String str3 = String.valueOf(str) + "::" + str2;
        Boolean bool = (Boolean) this.f47354k.get(str3);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (str.startsWith("file:/")) {
            str = m50128o(str.substring(5));
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                do {
                    try {
                        nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            this.f47354k.put(str3, Boolean.FALSE);
                            return false;
                        }
                    } finally {
                        zipInputStream.close();
                    }
                } while (!"META-INF/ShadowClassLoader".equals(nextEntry.getName()));
                boolean zM50127n = m50127n(zipInputStream, str2);
                this.f47354k.put(str3, Boolean.valueOf(zM50127n));
                return zM50127n;
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException unused) {
            this.f47354k.put(str3, Boolean.FALSE);
            return false;
        } catch (IOException unused2) {
            this.f47354k.put(str3, Boolean.FALSE);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Class] */
    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) throws IOException, ClassNotFoundException {
        Class<?> clsLoadClass;
        Class cls;
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (this.f47350g.contains(str) && (cls = (Class) f47341l.get(str)) != null) {
            return cls;
        }
        String str2 = String.valueOf(str.replace(".", "/")) + ".class";
        URL urlM50136h = m50136h(str2, true);
        String str3 = str;
        if (urlM50136h == null) {
            str3 = str;
            if (!m50131c(str2)) {
                try {
                    Iterator it = this.f47351h.iterator();
                    while (it.hasNext()) {
                        try {
                            clsLoadClass = ((ClassLoader) it.next()).loadClass(str);
                        } catch (Throwable unused) {
                        }
                        if (clsLoadClass != null) {
                            return clsLoadClass;
                        }
                    }
                    str = super.loadClass(str, z);
                    return str;
                } catch (ClassNotFoundException e) {
                    urlM50136h = m50136h("secondaryLoading.SCL." + this.f47348e + "/" + str.replace(".", "/") + ".SCL." + this.f47348e, true);
                    str3 = str;
                    if (urlM50136h == null) {
                        throw e;
                    }
                }
            }
        }
        if (urlM50136h != null) {
            return m50142p(str3, urlM50136h, z);
        }
        throw new ClassNotFoundException(str3);
    }

    /* renamed from: m */
    public final boolean m50141m(String str, String str2) {
        if (str2.startsWith("java/") || str2.startsWith("sun/")) {
            return false;
        }
        return m50137i(str, str2) || m50138j(str, str2, this.f47348e);
    }

    /* renamed from: p */
    public final Class m50142p(String str, URL url, boolean z) throws IOException, ClassFormatError, ClassNotFoundException {
        Class<?> clsDefineClass;
        Class cls;
        Class<?> cls2;
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                while (true) {
                    int i2 = inputStreamOpenStream.read(bArr, i, bArr.length - i);
                    if (i2 == -1) {
                        break;
                    }
                    i += i2;
                    if (i == bArr.length) {
                        byte[] bArr2 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                }
                try {
                    clsDefineClass = defineClass(str, bArr, 0, i);
                } catch (LinkageError e) {
                    if (this.f47350g.contains(str) && (cls = (Class) f47341l.get(str)) != null) {
                        return cls;
                    }
                    try {
                        Class<?> clsFindLoadedClass = findLoadedClass(str);
                        if (clsFindLoadedClass == null) {
                            throw e;
                        }
                        clsDefineClass = clsFindLoadedClass;
                    } catch (LinkageError unused) {
                        throw e;
                    }
                }
                if (this.f47350g.contains(str) && (cls2 = (Class) f47341l.putIfAbsent(str, clsDefineClass)) != null) {
                    clsDefineClass = cls2;
                }
                if (z) {
                    resolveClass(clsDefineClass);
                }
                return clsDefineClass;
            } finally {
                inputStreamOpenStream.close();
            }
        } catch (IOException e2) {
            throw new ClassNotFoundException("I/O exception reading class " + str, e2);
        }
    }
}
