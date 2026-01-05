package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import c3.C0848c;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.i18n.TextBundle;
import qw.C6361k;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.C6754j;
import s4.EnumC6757m;
import t3.AbstractC7016c;
import w4.C7911c;
import w4.C7927s;
import wr.C8158n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class pb implements t3.j0 {

    /* renamed from: a */
    public final /* synthetic */ int f12436a;

    /* renamed from: b */
    public final Object f12437b;

    /* renamed from: c */
    public final Object f12438c;

    public /* synthetic */ pb(int i10, Object obj, Object obj2) {
        this.f12436a = i10;
        this.f12437b = obj;
        this.f12438c = obj2;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        t3.w0 w0VarMo13314z;
        t3.w0 w0VarMo13314z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        C6361k c6361k;
        switch (this.f12436a) {
            case 0:
                if (((InterfaceC2141e) this.f12437b) != null) {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        t3.i0 i0Var = (t3.i0) list.get(i10);
                        if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var), TextBundle.TEXT_ENTRY)) {
                            w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, 0, 0, 0, 0, 11));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                w0VarMo13314z = null;
                if (((InterfaceC2141e) this.f12438c) != null) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        t3.i0 i0Var2 = (t3.i0) list.get(i11);
                        if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var2), "icon")) {
                            w0VarMo13314z2 = i0Var2.mo13314z(j6);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                w0VarMo13314z2 = null;
                int iMax = Math.max(w0VarMo13314z != null ? w0VarMo13314z.f34030a : 0, w0VarMo13314z2 != null ? w0VarMo13314z2.f34030a : 0);
                int iMax2 = Math.max(l0Var.e0((w0VarMo13314z == null || w0VarMo13314z2 == null) ? rb.f12615a : rb.f12616b), l0Var.mo8436Z(rb.f12620f) + (w0VarMo13314z2 != null ? w0VarMo13314z2.f34031b : 0) + (w0VarMo13314z != null ? w0VarMo13314z.f34031b : 0));
                return l0Var.g0(iMax, iMax2, C6669s.f31944a, new ob(w0VarMo13314z, w0VarMo13314z2, l0Var, iMax, iMax2, w0VarMo13314z != null ? Integer.valueOf(w0VarMo13314z.d0(AbstractC7016c.f33966a)) : null, w0VarMo13314z != null ? Integer.valueOf(w0VarMo13314z.d0(AbstractC7016c.f33967b)) : null));
            case 1:
                ((C7927s) this.f12437b).setParentLayoutDirection((EnumC6757m) this.f12438c);
                return l0Var.g0(0, 0, C6669s.f31944a, C7911c.f38077d);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj = list.get(i12);
                    if (!(((t3.i0) obj).mo13310C() instanceof x1.t1)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((InterfaceC2137a) this.f12438c).invoke();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size4 = list3.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        C0848c c0848c = (C0848c) list3.get(i13);
                        if (c0848c != null) {
                            float f6 = c0848c.f5355b;
                            float f10 = c0848c.f5354a;
                            t3.i0 i0Var3 = (t3.i0) arrayList3.get(i13);
                            int iFloor = (int) Math.floor(c0848c.f5356c - f10);
                            float f11 = c0848c.f5357d - f6;
                            arrayList2 = arrayList3;
                            list2 = list3;
                            c6361k = new C6361k(i0Var3.mo13314z(AbstractC6746b.m12924b(iFloor, (int) Math.floor(f11), 5)), new C6754j((Math.round(f6) & 4294967295L) | (Math.round(f10) << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list3;
                            c6361k = null;
                        }
                        if (c6361k != null) {
                            arrayList4.add(c6361k);
                        }
                        i13++;
                        arrayList3 = arrayList2;
                        list3 = list2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size5 = list.size();
                for (int i14 = 0; i14 < size5; i14++) {
                    Object obj2 = list.get(i14);
                    if (((t3.i0) obj2).mo13310C() instanceof x1.t1) {
                        arrayList5.add(obj2);
                    }
                }
                return l0Var.g0(C6745a.m12918i(j6), C6745a.m12917h(j6), C6669s.f31944a, new C8158n(arrayList, x1.r0.m15455o(arrayList5, (InterfaceC2137a) this.f12437b), 9));
        }
    }
}
