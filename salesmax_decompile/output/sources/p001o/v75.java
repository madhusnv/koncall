package p001o;

import android.util.Log;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class v75 {

    /* renamed from: a */
    public final Class f49950a;

    /* renamed from: b */
    public final List f49951b;

    /* renamed from: c */
    public final jpe f49952c;

    /* renamed from: d */
    public final ged f49953d;

    /* renamed from: e */
    public final String f49954e;

    /* renamed from: o.v75$a */
    public interface InterfaceC17522a {
        /* renamed from: a */
        zne mo51111a(zne zneVar);
    }

    public v75(Class cls, Class cls2, Class cls3, List list, jpe jpeVar, ged gedVar) {
        this.f49950a = cls;
        this.f49951b = list;
        this.f49952c = jpeVar;
        this.f49953d = gedVar;
        this.f49954e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public zne m52403a(InterfaceC10732a interfaceC10732a, int i, int i2, rec recVar, InterfaceC17522a interfaceC17522a) {
        return this.f49952c.mo17137a(interfaceC17522a.mo51111a(m52404b(interfaceC10732a, i, i2, recVar)), recVar);
    }

    /* renamed from: b */
    public final zne m52404b(InterfaceC10732a interfaceC10732a, int i, int i2, rec recVar) {
        List list = (List) bgd.m18886d(this.f49953d.mo28526b());
        try {
            return m52405c(interfaceC10732a, i, i2, recVar, list);
        } finally {
            this.f49953d.mo28525a(list);
        }
    }

    /* renamed from: c */
    public final zne m52405c(InterfaceC10732a interfaceC10732a, int i, int i2, rec recVar, List list) throws xs7 {
        int size = this.f49951b.size();
        zne zneVarMo16416b = null;
        for (int i3 = 0; i3 < size; i3++) {
            ioe ioeVar = (ioe) this.f49951b.get(i3);
            try {
                if (ioeVar.mo16415a(interfaceC10732a.mo12701c(), recVar)) {
                    zneVarMo16416b = ioeVar.mo16416b(interfaceC10732a.mo12701c(), i, i2, recVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(ioeVar);
                }
                list.add(e);
            }
            if (zneVarMo16416b != null) {
                break;
            }
        }
        if (zneVarMo16416b != null) {
            return zneVarMo16416b;
        }
        throw new xs7(this.f49954e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f49950a + ", decoders=" + this.f49951b + ", transcoder=" + this.f49952c + '}';
    }
}
