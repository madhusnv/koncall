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
public abstract class sdb {

    /* renamed from: a */
    public static final rdb f45283a = new C16814a();

    /* renamed from: b */
    public static final Logger f45284b = Logger.getLogger(sdb.class.getName());

    /* renamed from: c */
    public static final ConcurrentHashMap f45285c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentHashMap f45286d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final Set f45287e = rb0.m46479a();

    /* renamed from: f */
    public static final Set f45288f = ypf.m58069a();

    /* renamed from: o.sdb$a */
    public class C16814a implements rdb {
        @Override // p001o.rdb
        /* renamed from: a */
        public InputStream mo46562a(String str) {
            return sdb.class.getResourceAsStream(str);
        }
    }

    /* renamed from: a */
    public static i7d m48260a(Object obj, ConcurrentHashMap concurrentHashMap, String str, rdb rdbVar) {
        i7d i7dVar = (i7d) concurrentHashMap.get(obj);
        if (i7dVar != null) {
            return i7dVar;
        }
        String str2 = str + "_" + obj;
        List listM48261b = m48261b(str2, rdbVar);
        if (listM48261b.size() > 1) {
            f45284b.log(Level.WARNING, "more than one metadata in file " + str2);
        }
        i7d i7dVar2 = (i7d) listM48261b.get(0);
        i7d i7dVar3 = (i7d) concurrentHashMap.putIfAbsent(obj, i7dVar2);
        return i7dVar3 != null ? i7dVar3 : i7dVar2;
    }

    /* renamed from: b */
    public static List m48261b(String str, rdb rdbVar) {
        InputStream inputStreamMo46562a = rdbVar.mo46562a(str);
        if (inputStreamMo46562a == null) {
            throw new IllegalStateException("missing metadata: " + str);
        }
        List listM35114b = m48262c(inputStreamMo46562a).m35114b();
        if (listM35114b.size() != 0) {
            return listM35114b;
        }
        throw new IllegalStateException("empty metadata: " + str);
    }

    /* renamed from: c */
    public static k7d m48262c(InputStream inputStream) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
                try {
                    k7d k7dVar = new k7d();
                    try {
                        k7dVar.readExternal(objectInputStream2);
                        try {
                            objectInputStream2.close();
                        } catch (IOException e) {
                            f45284b.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e);
                        }
                        return k7dVar;
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
                        f45284b.log(Level.WARNING, "error closing input stream (ignored)", (Throwable) e3);
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
}
