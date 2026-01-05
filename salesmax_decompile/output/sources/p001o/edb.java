package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class edb implements n91 {

    /* renamed from: a */
    public final C13161a f21433a;

    /* renamed from: b */
    public final wa4 f21434b;

    /* renamed from: c */
    public final Map f21435c;

    /* renamed from: o.edb$a */
    public static class C13161a {

        /* renamed from: a */
        public final Context f21436a;

        /* renamed from: b */
        public Map f21437b = null;

        public C13161a(Context context) {
            this.f21436a = context;
        }

        /* renamed from: d */
        public static Bundle m24796d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final Map m24797a(Context context) {
            Bundle bundleM24796d = m24796d(context);
            if (bundleM24796d == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleM24796d.keySet()) {
                Object obj = bundleM24796d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        /* renamed from: b */
        public m91 m24798b(String str) {
            String str2 = (String) m24799c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (m91) Class.forName(str2).asSubclass(m91.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }

        /* renamed from: c */
        public final Map m24799c() {
            if (this.f21437b == null) {
                this.f21437b = m24797a(this.f21436a);
            }
            return this.f21437b;
        }
    }

    public edb(Context context, wa4 wa4Var) {
        this(new C13161a(context), wa4Var);
    }

    @Override // p001o.n91
    public synchronized pwh get(String str) {
        if (this.f21435c.containsKey(str)) {
            return (pwh) this.f21435c.get(str);
        }
        m91 m91VarM24798b = this.f21433a.m24798b(str);
        if (m91VarM24798b == null) {
            return null;
        }
        pwh pwhVarCreate = m91VarM24798b.create(this.f21434b.m54131a(str));
        this.f21435c.put(str, pwhVarCreate);
        return pwhVarCreate;
    }

    public edb(C13161a c13161a, wa4 wa4Var) {
        this.f21435c = new HashMap();
        this.f21433a = c13161a;
        this.f21434b = wa4Var;
    }
}
