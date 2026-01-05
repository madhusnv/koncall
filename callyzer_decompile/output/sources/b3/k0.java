package b3;

import android.graphics.Rect;
import android.view.View;
import b2.C0566x;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1594v;
import d4.C1576d;
import d4.C1582j;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import g2.c4;
import g2.f4;
import g2.p5;
import java.util.ArrayList;
import k2.b1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4166x;
import lx.InterfaceC4574m;
import o1.AbstractC5244c;
import o1.C5261t;
import o1.l1;
import og.b2;
import og.pe;
import og.ze;
import r1.C6434s;
import r1.C6440y;
import rw.AbstractC6663m;
import rw.C6668r;
import s4.EnumC6757m;
import t3.InterfaceC7017d;
import t3.InterfaceC7033t;
import t3.v0;
import tx.InterfaceC7266z;
import v3.AbstractC7634f;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3921a;

    /* renamed from: b */
    public final /* synthetic */ Object f3922b;

    /* renamed from: c */
    public final /* synthetic */ Object f3923c;

    /* renamed from: d */
    public final /* synthetic */ int f3924d;

    /* renamed from: e */
    public final /* synthetic */ Object f3925e;

    /* renamed from: f */
    public final /* synthetic */ Object f3926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i10, int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.f3921a = i11;
        this.f3922b = obj;
        this.f3924d = i10;
        this.f3923c = obj2;
        this.f3926f = obj3;
        this.f3925e = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.List] */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object objM10834i;
        C6434s c6434s;
        int i10 = this.f3921a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f3925e;
        Object obj3 = this.f3926f;
        int i11 = this.f3924d;
        Object obj4 = this.f3923c;
        Object obj5 = this.f3922b;
        switch (i10) {
            case 0:
                InterfaceC7017d interfaceC7017d = (InterfaceC7017d) obj;
                e0 e0Var = (e0) obj4;
                if (((e0) obj5) != ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var)).getFocusOwner()).f3947l) {
                    break;
                } else {
                    boolean zM1712C = AbstractC0574f.m1712C(e0Var, (e0) obj3, i11, (C0566x) obj2);
                    Boolean boolValueOf = Boolean.valueOf(zM1712C);
                    if (zM1712C || !interfaceC7017d.mo12850a()) {
                        break;
                    }
                }
                break;
            case 1:
                InterfaceC7017d interfaceC7017d2 = (InterfaceC7017d) obj;
                e0 e0Var2 = (e0) obj4;
                if (((e0) obj5) != ((C0585q) ((C7904v) AbstractC7634f.m14564y(e0Var2)).getFocusOwner()).f3947l) {
                    break;
                } else {
                    boolean zM1711B = AbstractC0574f.m1711B(i11, (C0566x) obj2, e0Var2, (C0848c) obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(zM1711B);
                    if (zM1711B || !interfaceC7017d2.mo12850a()) {
                        break;
                    }
                }
                break;
            case 2:
                InterfaceC1596x interfaceC1596x = (InterfaceC1596x) obj;
                C6440y c6440y = (C6440y) obj5;
                if (c6440y.f31077d.f29752b.m8526f() == i11 || ((c6434s = (C6434s) AbstractC6663m.m12751O(c6440y.m12434g().f31030l)) != null && c6434s.f31037a == i11)) {
                    InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj4;
                    float f6 = f4.f11555a;
                    objM10834i = pe.m10834i(new C1576d((String) obj3, new c4(c6440y, interfaceC7266z, 1)), new C1576d((String) obj2, new c4(c6440y, interfaceC7266z, 0)));
                } else {
                    objM10834i = C6668r.f31943a;
                }
                InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                C1595w c1595w = C1582j.f7864w;
                InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[26];
                c1595w.m5236a(interfaceC1596x, objM10834i);
                break;
            case 3:
                InterfaceC7033t interfaceC7033t = (InterfaceC7033t) obj;
                w0 w0Var = (w0) obj4;
                w0Var.setValue(interfaceC7033t);
                ((b1) obj3).m8527g((int) (interfaceC7033t.mo13307v() >> 32));
                b1 b1Var = (b1) obj2;
                View rootView = ((View) obj5).getRootView();
                Rect rect = new Rect();
                rootView.getWindowVisibleDisplayFrame(rect);
                C0848c c0848cM5150v = d3.h0.m5150v(rect);
                InterfaceC7033t interfaceC7033t2 = (InterfaceC7033t) w0Var.getValue();
                b1Var.m8527g(p5.m6229c(i11, c0848cM5150v, interfaceC7033t2 == null ? C0848c.f5353e : b2.m10543a(interfaceC7033t2.mo13303f(0L), ze.m11098d(interfaceC7033t2.mo13307v()))));
                break;
            case 4:
                v0 v0Var = (v0) obj;
                ArrayList arrayList = (ArrayList) obj5;
                C4166x c4166x = (C4166x) obj2;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    v0.m13319g(v0Var, (t3.w0) arrayList.get(i12), c4166x.f21162a * i12, 0);
                }
                ArrayList arrayList2 = (ArrayList) obj4;
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    t3.w0 w0Var2 = (t3.w0) arrayList2.get(i13);
                    v0.m13319g(v0Var, w0Var2, 0, i11 - w0Var2.f34031b);
                }
                ArrayList arrayList3 = (ArrayList) obj3;
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    t3.w0 w0Var3 = (t3.w0) arrayList3.get(i14);
                    v0.m13319g(v0Var, w0Var3, 0, i11 - w0Var3.f34031b);
                }
                break;
            default:
                v0 v0Var2 = (v0) obj;
                t3.w0[] w0VarArr = (t3.w0[]) obj5;
                C5261t c5261t = (C5261t) obj4;
                t3.l0 l0Var = (t3.l0) obj3;
                int[] iArr = (int[]) obj2;
                int length = w0VarArr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length) {
                    t3.w0 w0Var4 = w0VarArr[i15];
                    int i17 = i16 + 1;
                    AbstractC4154l.m8920c(w0Var4);
                    Object objMo13310C = w0Var4.mo13310C();
                    l1 l1Var = objMo13310C instanceof l1 ? (l1) objMo13310C : null;
                    EnumC6757m layoutDirection = l0Var.getLayoutDirection();
                    AbstractC5244c abstractC5244c = l1Var != null ? l1Var.f25784c : null;
                    v0Var2.m13324d(w0Var4, abstractC5244c != null ? abstractC5244c.mo10334g(i11 - w0Var4.f34030a, layoutDirection) : c5261t.f25849b.mo14847a(0, i11 - w0Var4.f34030a, layoutDirection), iArr[i16], DefinitionKt.NO_Float_VALUE);
                    i15++;
                    i16 = i17;
                }
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(f0 f0Var, e0 e0Var, e0 e0Var2, Object obj, int i10, C0566x c0566x, int i11) {
        super(1);
        this.f3921a = i11;
        this.f3922b = e0Var;
        this.f3923c = e0Var2;
        this.f3926f = obj;
        this.f3924d = i10;
        this.f3925e = c0566x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C4166x c4166x, int i10) {
        super(1);
        this.f3921a = 4;
        this.f3922b = arrayList;
        this.f3923c = arrayList2;
        this.f3926f = arrayList3;
        this.f3925e = c4166x;
        this.f3924d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(t3.w0[] w0VarArr, C5261t c5261t, int i10, t3.l0 l0Var, int[] iArr) {
        super(1);
        this.f3921a = 5;
        this.f3922b = w0VarArr;
        this.f3923c = c5261t;
        this.f3924d = i10;
        this.f3926f = l0Var;
        this.f3925e = iArr;
    }
}
