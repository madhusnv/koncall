package vc;

import aw.C0471k;
import ec.InterfaceC2004b;
import er.C2123w;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import nd.InterfaceC5016g;
import og.md;
import og.nd;
import og.od;
import og.u1;
import qd.InterfaceC6187g;
import qw.C6366p;
import qw.InterfaceC6357g;
import qw.a0;
import sb.C6780g;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vc.e */
/* loaded from: classes.dex */
public final class C7702e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f37210a;

    /* renamed from: b */
    public /* synthetic */ Object f37211b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6187g f37212c;

    /* renamed from: d */
    public final /* synthetic */ C6780g f37213d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2004b f37214e;

    /* renamed from: f */
    public InterfaceC6357g f37215f;

    /* renamed from: g */
    public Object[] f37216g;

    /* renamed from: h */
    public InterfaceC5016g f37217h;

    /* renamed from: j */
    public InterfaceC7700c f37218j;

    /* renamed from: k */
    public int f37219k;

    /* renamed from: l */
    public int f37220l;

    /* renamed from: m */
    public int f37221m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7702e(InterfaceC6187g interfaceC6187g, InterfaceC7559c interfaceC7559c, C6780g c6780g, InterfaceC2004b interfaceC2004b) {
        super(2, interfaceC7559c);
        this.f37212c = interfaceC6187g;
        this.f37213d = c6780g;
        this.f37214e = interfaceC2004b;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C7702e c7702e = new C7702e(this.f37212c, interfaceC7559c, this.f37213d, this.f37214e);
        c7702e.f37211b = obj;
        return c7702e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C7702e) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0080 -> B:20:0x0083). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6357g interfaceC6357g;
        InterfaceC7700c[] interfaceC7700cArr;
        InterfaceC5016g interfaceC5016g;
        int i10;
        ?? length;
        InterfaceC7700c interfaceC7700c;
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f37211b;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i11 = this.f37210a;
        try {
        } catch (Exception e2) {
            interfaceC5016g.mo332i(null, new C0471k(13, interfaceC7700c, e2));
            md.m10764a((Throwable) interfaceC6357g.getValue(), e2);
            i11++;
            length = interfaceC7266z;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r02 = this.f37221m;
            i11 = this.f37220l;
            i10 = this.f37219k;
            interfaceC7700c = this.f37218j;
            interfaceC5016g = this.f37217h;
            interfaceC7700cArr = (InterfaceC7700c[]) this.f37216g;
            interfaceC6357g = this.f37215f;
            od.m10798c(obj);
            interfaceC7266z = r02;
            AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain");
            return (InterfaceC7698a) obj;
        }
        od.m10798c(obj);
        InterfaceC7564h interfaceC7564hMo1865w = interfaceC7266z.mo1865w();
        String strM8913b = kotlin.jvm.internal.a0.m8901a(C6780g.class).m8913b();
        if (strM8913b == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
        }
        C4367l c4367lM10949h = u1.m10949h(interfaceC7564hMo1865w, strM8913b);
        C6780g c6780g = this.f37213d;
        C6366p c6366pM10782c = nd.m10782c(new C2123w(9, c6780g));
        InterfaceC7700c[] interfaceC7700cArr2 = c6780g.f32244a;
        interfaceC5016g = c4367lM10949h;
        interfaceC6357g = c6366pM10782c;
        interfaceC7700cArr = interfaceC7700cArr2;
        length = interfaceC7700cArr2.length;
        i11 = 0;
        i10 = 0;
        if (i11 >= length) {
            throw ((Throwable) interfaceC6357g.getValue());
        }
        interfaceC7700c = interfaceC7700cArr[i11];
        interfaceC5016g.mo330g(null, new C2123w(8, interfaceC7700c));
        InterfaceC2004b interfaceC2004b = this.f37214e;
        this.f37211b = null;
        this.f37215f = interfaceC6357g;
        this.f37216g = interfaceC7700cArr;
        this.f37217h = interfaceC5016g;
        this.f37218j = interfaceC7700c;
        this.f37219k = i10;
        this.f37220l = i11;
        this.f37221m = length;
        this.f37210a = 1;
        obj = interfaceC7700c.resolve(interfaceC2004b, this);
        interfaceC7266z = length;
        if (obj == enumC7794a) {
            return enumC7794a;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type I of aws.smithy.kotlin.runtime.identity.IdentityProviderChain");
        return (InterfaceC7698a) obj;
    }
}
