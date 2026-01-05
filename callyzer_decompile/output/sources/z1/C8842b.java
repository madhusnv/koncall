package z1;

import d3.b0;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4153k;
import qw.a0;
import t3.InterfaceC7033t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C8842b extends AbstractC4152j implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C8850j f42560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8842b(C8850j c8850j) {
        super(1, AbstractC4153k.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f42560a = c8850j;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        float[] fArr = ((b0) obj).f7732a;
        InterfaceC7033t interfaceC7033t = (InterfaceC7033t) this.f42560a.f42588t.getValue();
        if (interfaceC7033t != null) {
            if (!interfaceC7033t.mo13305s()) {
                interfaceC7033t = null;
            }
            if (interfaceC7033t != null) {
                interfaceC7033t.mo13306t(fArr);
            }
        }
        return a0.f30746a;
    }
}
