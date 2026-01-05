package dr;

import android.content.Context;
import br.C0740c;
import c9.C0908c;
import eo.C2082h;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import nx.AbstractC5178p;
import og.od;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.g */
/* loaded from: classes3.dex */
public final class C1757g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public C1775y f8515a;

    /* renamed from: b */
    public String f8516b;

    /* renamed from: c */
    public ArrayList f8517c;

    /* renamed from: d */
    public LocalDateTime f8518d;

    /* renamed from: e */
    public LocalDateTime f8519e;

    /* renamed from: f */
    public C0908c f8520f;

    /* renamed from: g */
    public int f8521g;

    /* renamed from: h */
    public int f8522h;

    /* renamed from: j */
    public int f8523j;

    /* renamed from: k */
    public final /* synthetic */ C1775y f8524k;

    /* renamed from: l */
    public final /* synthetic */ ArrayList f8525l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1757g(C1775y c1775y, ArrayList arrayList, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8524k = c1775y;
        this.f8525l = arrayList;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C1757g(this.f8524k, this.f8525l, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1757g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        C1775y c1775y;
        C0908c c0908c;
        LocalDateTime localDateTime;
        LocalDateTime localDateTime2;
        int i10;
        String string;
        ArrayList arrayList;
        int i11;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i12 = this.f8523j;
        if (i12 == 0) {
            od.m10798c(obj);
            c1775y = this.f8524k;
            C0740c c0740c = (C0740c) c1775y.f8636s.f39340a.getValue();
            c0908c = c1775y.f8626i;
            localDateTime = c0740c.f4676j;
            localDateTime2 = c0740c.f4677k;
            i10 = Integer.parseInt(c0740c.f4680n);
            string = AbstractC5178p.g0(c0740c.f4681o).toString();
            C2082h c2082h = c1775y.f8628k;
            EnumC7204p enumC7204p = c0740c.f4675i;
            this.f8515a = c1775y;
            this.f8516b = string;
            arrayList = this.f8525l;
            this.f8517c = arrayList;
            this.f8518d = localDateTime2;
            this.f8519e = localDateTime;
            this.f8520f = c0908c;
            this.f8521g = 0;
            this.f8522h = i10;
            this.f8523j = 1;
            obj = c2082h.m5797f(enumC7204p, this);
            if (obj != enumC7794a) {
                i11 = 0;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        i10 = this.f8522h;
        i11 = this.f8521g;
        c0908c = this.f8520f;
        localDateTime = this.f8519e;
        localDateTime2 = this.f8518d;
        ArrayList arrayList2 = this.f8517c;
        string = this.f8516b;
        c1775y = this.f8515a;
        od.m10798c(obj);
        arrayList = arrayList2;
        int i13 = i10;
        Context context = c1775y.f8623f;
        this.f8515a = null;
        this.f8516b = null;
        this.f8517c = null;
        this.f8518d = null;
        this.f8519e = null;
        this.f8520f = null;
        this.f8521g = i11;
        this.f8523j = 2;
        Object objM2567l = c0908c.m2567l(localDateTime, localDateTime2, arrayList, i13, string, (String) obj, context, this);
        return objM2567l == enumC7794a ? enumC7794a : objM2567l;
    }
}
