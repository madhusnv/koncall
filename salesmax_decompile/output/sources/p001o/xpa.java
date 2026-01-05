package p001o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class xpa {

    /* renamed from: a */
    public final Context f54039a;

    public xpa(Context context) {
        this.f54039a = context;
    }

    /* renamed from: b */
    public static zs7 m56568b(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                m56569c(cls, e);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (InstantiationException e2) {
                m56569c(cls, e2);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (NoSuchMethodException e3) {
                m56569c(cls, e3);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (InvocationTargetException e4) {
                m56569c(cls, e4);
                objNewInstance = null;
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    public static void m56569c(Class cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List m56570a() throws IllegalAccessException, PackageManager.NameNotFoundException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f54039a.getPackageManager().getApplicationInfo(this.f54039a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    m56568b(str);
                    arrayList.add(null);
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
