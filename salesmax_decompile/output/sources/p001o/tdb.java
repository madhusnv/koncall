package p001o;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class tdb {

    /* renamed from: f */
    public static final Logger f46889f = Logger.getLogger(tdb.class.getName());

    /* renamed from: a */
    public final qdb f46890a;

    /* renamed from: b */
    public final ConcurrentHashMap f46891b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f46892c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Set f46893d = qb0.m45054a();

    /* renamed from: e */
    public final Set f46894e = xpf.m56574a();

    public tdb(qdb qdbVar) {
        this.f46890a = qdbVar;
    }

    /* renamed from: b */
    public static List m49752b(String str, qdb qdbVar) {
        InputStream inputStreamMo45202a = qdbVar.mo45202a(str);
        if (inputStreamMo45202a == null) {
            throw new IllegalStateException("missing metadata: " + str);
        }
        List listM33380b = m49753c(inputStreamMo45202a).m33380b();
        if (listM33380b.size() != 0) {
            return listM33380b;
        }
        throw new IllegalStateException("empty metadata: " + str);
    }

    /* renamed from: c */
    public static j7d m49753c(InputStream inputStream) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
                try {
                    j7d j7dVar = new j7d();
                    try {
                        j7dVar.readExternal(objectInputStream2);
                        try {
                            objectInputStream2.close();
                        } catch (IOException e) {
                            f46889f.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e);
                        }
                        return j7dVar;
                    } catch (IOException e2) {
                        throw new RuntimeException("cannot load/parse metadata", e2);
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    try {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        } else {
                            inputStream.close();
                        }
                    } catch (IOException e3) {
                        f46889f.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e3);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            throw new RuntimeException("cannot load/parse metadata", e4);
        }
    }

    /* renamed from: a */
    public h7d m49754a(Object obj, ConcurrentHashMap concurrentHashMap, String str) {
        h7d h7dVar = (h7d) concurrentHashMap.get(obj);
        if (h7dVar != null) {
            return h7dVar;
        }
        String str2 = str + "_" + obj;
        List listM49752b = m49752b(str2, this.f46890a);
        if (listM49752b.size() > 1) {
            f46889f.log(Level.WARNING, "more than one metadata in file " + str2);
        }
        h7d h7dVar2 = (h7d) listM49752b.get(0);
        h7d h7dVar3 = (h7d) concurrentHashMap.putIfAbsent(obj, h7dVar2);
        return h7dVar3 != null ? h7dVar3 : h7dVar2;
    }
}
