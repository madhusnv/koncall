package p001o;

import com.bumptech.glide.load.data.InterfaceC10732a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001o.v75;

/* loaded from: classes5.dex */
public class uga {

    /* renamed from: a */
    public final Class f48906a;

    /* renamed from: b */
    public final ged f48907b;

    /* renamed from: c */
    public final List f48908c;

    /* renamed from: d */
    public final String f48909d;

    public uga(Class cls, Class cls2, Class cls3, List list, ged gedVar) {
        this.f48906a = cls;
        this.f48907b = gedVar;
        this.f48908c = (List) bgd.m18885c(list);
        this.f48909d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public zne m51565a(InterfaceC10732a interfaceC10732a, rec recVar, int i, int i2, v75.InterfaceC17522a interfaceC17522a) {
        List list = (List) bgd.m18886d(this.f48907b.mo28526b());
        try {
            return m51566b(interfaceC10732a, recVar, i, i2, interfaceC17522a, list);
        } finally {
            this.f48907b.mo28525a(list);
        }
    }

    /* renamed from: b */
    public final zne m51566b(InterfaceC10732a interfaceC10732a, rec recVar, int i, int i2, v75.InterfaceC17522a interfaceC17522a, List list) throws xs7 {
        int size = this.f48908c.size();
        zne zneVarM52403a = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                zneVarM52403a = ((v75) this.f48908c.get(i3)).m52403a(interfaceC10732a, i, i2, recVar, interfaceC17522a);
            } catch (xs7 e) {
                list.add(e);
            }
            if (zneVarM52403a != null) {
                break;
            }
        }
        if (zneVarM52403a != null) {
            return zneVarM52403a;
        }
        throw new xs7(this.f48909d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f48908c.toArray()) + '}';
    }
}
