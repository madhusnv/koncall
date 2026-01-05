package l1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4165w;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.e */
/* loaded from: classes.dex */
public final class C4316e extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21754a;

    /* renamed from: b */
    public final /* synthetic */ C4165w f21755b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f21756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4316e(C4165w c4165w, InterfaceC2139c interfaceC2139c, int i10) {
        super(1);
        this.f21754a = i10;
        this.f21755b = c4165w;
        this.f21756c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f21754a) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C4165w c4165w = this.f21755b;
                float f6 = c4165w.f21161a - fFloatValue;
                c4165w.f21161a = f6;
                this.f21756c.invoke(Float.valueOf(f6));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                C4165w c4165w2 = this.f21755b;
                float f10 = c4165w2.f21161a - fFloatValue2;
                c4165w2.f21161a = f10;
                this.f21756c.invoke(Float.valueOf(f10));
                break;
        }
        return a0.f30746a;
    }
}
