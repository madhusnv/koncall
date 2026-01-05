package yq;

import c9.C0908c;
import ex.InterfaceC2143g;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import og.pe;
import om.C5406h;
import om.C5416r;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import xm.w2;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yq.b */
/* loaded from: classes3.dex */
public final class C8737b extends AbstractC8199i implements InterfaceC2143g {

    /* renamed from: a */
    public final /* synthetic */ int f42289a;

    /* renamed from: b */
    public int f42290b;

    /* renamed from: c */
    public /* synthetic */ EnumC8994d f42291c;

    /* renamed from: d */
    public /* synthetic */ int f42292d;

    /* renamed from: e */
    public /* synthetic */ String f42293e;

    /* renamed from: f */
    public final /* synthetic */ C8741f f42294f;

    /* renamed from: g */
    public final /* synthetic */ LocalDateTime f42295g;

    /* renamed from: h */
    public final /* synthetic */ LocalDateTime f42296h;

    /* renamed from: j */
    public final /* synthetic */ String f42297j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8737b(C8741f c8741f, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(4, interfaceC7559c);
        this.f42289a = i10;
        this.f42294f = c8741f;
        this.f42295g = localDateTime;
        this.f42296h = localDateTime2;
        this.f42297j = str;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10 = this.f42289a;
        EnumC8994d enumC8994d = (EnumC8994d) obj;
        int iIntValue = ((Number) obj2).intValue();
        String str = (String) obj3;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj4;
        switch (i10) {
            case 0:
                C8737b c8737b = new C8737b(this.f42294f, this.f42295g, this.f42296h, this.f42297j, interfaceC7559c, 0);
                c8737b.f42291c = enumC8994d;
                c8737b.f42292d = iIntValue;
                c8737b.f42293e = str;
                return c8737b.invokeSuspend(a0.f30746a);
            default:
                C8737b c8737b2 = new C8737b(this.f42294f, this.f42295g, this.f42296h, this.f42297j, interfaceC7559c, 1);
                c8737b2.f42291c = enumC8994d;
                c8737b2.f42292d = iIntValue;
                c8737b2.f42293e = str;
                return c8737b2.invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Long l9;
        switch (this.f42289a) {
            case 0:
                EnumC8994d enumC8994d = this.f42291c;
                int i10 = this.f42292d;
                String str = this.f42293e;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42290b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C0908c c0908c = this.f42294f.f42333b;
                    LocalDateTime localDateTime = this.f42295g;
                    AbstractC4154l.m8920c(localDateTime);
                    LocalDateTime localDateTime2 = this.f42296h;
                    AbstractC4154l.m8920c(localDateTime2);
                    List listM10833h = pe.m10833h(enumC8994d);
                    this.f42291c = null;
                    this.f42293e = null;
                    this.f42292d = i10;
                    this.f42290b = 1;
                    obj = c0908c.m2579x(i10, this.f42297j, str, localDateTime, localDateTime2, listM10833h, this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                C5406h c5406h = (C5406h) obj;
                return new Long((c5406h == null || (l9 = c5406h.f27141b) == null) ? 0L : l9.longValue());
            default:
                EnumC8994d enumC8994d2 = this.f42291c;
                int i12 = this.f42292d;
                String str2 = this.f42293e;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f42290b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C0908c c0908c2 = this.f42294f.f42333b;
                    LocalDateTime localDateTime3 = this.f42295g;
                    AbstractC4154l.m8920c(localDateTime3);
                    LocalDateTime localDateTime4 = this.f42296h;
                    AbstractC4154l.m8920c(localDateTime4);
                    this.f42291c = null;
                    this.f42293e = null;
                    this.f42292d = i12;
                    this.f42290b = 1;
                    obj = ((w2) c0908c2.f5574b).f40962a.m6705y(i12, str2, this.f42297j, localDateTime3, localDateTime4, this, enumC8994d2);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return new Integer(((C5416r) obj).f27213a);
        }
    }
}
