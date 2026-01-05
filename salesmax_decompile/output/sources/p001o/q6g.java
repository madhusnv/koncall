package p001o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class q6g {

    /* renamed from: a */
    public final InterfaceC16299a f41379a;

    /* renamed from: b */
    public final lgc f41380b;

    /* renamed from: c */
    public final Map f41381c = new HashMap();

    /* renamed from: d */
    public final Map f41382d = new HashMap();

    /* renamed from: e */
    public final Map f41383e = new HashMap();

    /* renamed from: o.q6g$a */
    public interface InterfaceC16299a {
        /* renamed from: a */
        StreamConfigurationMap mo44879a();

        /* renamed from: b */
        Size[] mo44880b(int i);

        /* renamed from: c */
        int[] mo44881c();

        /* renamed from: d */
        Size[] mo44882d(int i);
    }

    public q6g(StreamConfigurationMap streamConfigurationMap, lgc lgcVar) {
        this.f41379a = new r6g(streamConfigurationMap);
        this.f41380b = lgcVar;
    }

    /* renamed from: e */
    public static q6g m44874e(StreamConfigurationMap streamConfigurationMap, lgc lgcVar) {
        return new q6g(streamConfigurationMap, lgcVar);
    }

    /* renamed from: a */
    public Size[] m44875a(int i) {
        if (this.f41382d.containsKey(Integer.valueOf(i))) {
            if (((Size[]) this.f41382d.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f41382d.get(Integer.valueOf(i))).clone();
        }
        Size[] sizeArrMo44882d = this.f41379a.mo44882d(i);
        if (sizeArrMo44882d != null && sizeArrMo44882d.length > 0) {
            sizeArrMo44882d = this.f41380b.m37153b(sizeArrMo44882d, i);
        }
        this.f41382d.put(Integer.valueOf(i), sizeArrMo44882d);
        if (sizeArrMo44882d != null) {
            return (Size[]) sizeArrMo44882d.clone();
        }
        return null;
    }

    /* renamed from: b */
    public int[] m44876b() {
        int[] iArrMo44881c = this.f41379a.mo44881c();
        if (iArrMo44881c == null) {
            return null;
        }
        return (int[]) iArrMo44881c.clone();
    }

    /* renamed from: c */
    public Size[] m44877c(int i) {
        if (this.f41381c.containsKey(Integer.valueOf(i))) {
            if (((Size[]) this.f41381c.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) this.f41381c.get(Integer.valueOf(i))).clone();
        }
        Size[] sizeArrMo44880b = this.f41379a.mo44880b(i);
        if (sizeArrMo44880b != null && sizeArrMo44880b.length != 0) {
            Size[] sizeArrM37153b = this.f41380b.m37153b(sizeArrMo44880b, i);
            this.f41381c.put(Integer.valueOf(i), sizeArrM37153b);
            return (Size[]) sizeArrM37153b.clone();
        }
        wja.m54638l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return sizeArrMo44880b;
    }

    /* renamed from: d */
    public StreamConfigurationMap m44878d() {
        return this.f41379a.mo44879a();
    }
}
