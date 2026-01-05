package ee;

import c9.C0908c;
import com.google.android.gms.internal.measurement.e0;
import e1.C1917s;
import f1.C2177b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import sf.AbstractC6840z;
import ug.C7439j;
import ug.C7443n;
import ug.h4;
import ug.i1;
import ug.n1;
import ug.v0;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ee.e */
/* loaded from: classes.dex */
public final class C2037e extends C1917s {

    /* renamed from: h */
    public final /* synthetic */ int f9598h = 0;

    /* renamed from: i */
    public final /* synthetic */ Object f9599i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2037e(i1 i1Var) {
        super(20);
        this.f9599i = i1Var;
    }

    @Override // e1.C1917s
    /* renamed from: c */
    public Object mo5615c(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        switch (this.f9598h) {
            case 1:
                String str = (String) obj;
                AbstractC6840z.m13033d(str);
                i1 i1Var = (i1) this.f9599i;
                i1Var.m13858N();
                AbstractC6840z.m13033d(str);
                C7443n c7443n = i1Var.f35959b.f35488c;
                h4.m13944U(c7443n);
                C7439j c7439jS0 = c7443n.S0(str);
                if (c7439jS0 == null) {
                    return null;
                }
                v0 v0Var = ((n1) i1Var.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35870p.m14141b(str, "Populate EES config from database on cache miss. appId");
                i1Var.m13991U(str, i1Var.m13992V(str, (byte[]) c7439jS0.f35537b));
                C2037e c2037e = i1Var.f35516k;
                synchronized (((C8687a) c2037e.f9052g)) {
                    Set setEntrySet = ((C2177b) c2037e.f9051f).f10051a.entrySet();
                    AbstractC4154l.m8922e(setEntrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((C2177b) c2037e.f9051f).f10051a.entrySet();
                    AbstractC4154l.m8922e(setEntrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (e0) linkedHashMap.get(str);
            default:
                return super.mo5615c(obj);
        }
    }

    @Override // e1.C1917s
    /* renamed from: d */
    public void mo5616d(Object obj, Object obj2, Object obj3) {
        switch (this.f9598h) {
            case 0:
                C2036d c2036d = (C2036d) obj2;
                ((C2039g) ((C0908c) this.f9599i).f5574b).m5767q((C2033a) obj, c2036d.f9595a, c2036d.f9596b, c2036d.f9597c);
                break;
            default:
                super.mo5616d(obj, obj2, obj3);
                break;
        }
    }

    @Override // e1.C1917s
    /* renamed from: o */
    public int mo5627o(Object obj, Object obj2) {
        switch (this.f9598h) {
            case 0:
                return ((C2036d) obj2).f9597c;
            default:
                return super.mo5627o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2037e(int i10, C0908c c0908c) {
        super(i10);
        this.f9599i = c0908c;
    }
}
