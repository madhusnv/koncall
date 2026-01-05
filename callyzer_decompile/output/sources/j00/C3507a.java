package j00;

import a9.C0073l;
import c9.C0927v;
import com.google.gson.reflect.TypeToken;
import i00.AbstractC3105j;
import i00.InterfaceC3106k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kk.C4088h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j00.a */
/* loaded from: classes3.dex */
public final class C3507a extends AbstractC3105j {

    /* renamed from: a */
    public final C4088h f18378a;

    public C3507a(C4088h c4088h) {
        this.f18378a = c4088h;
    }

    @Override // i00.AbstractC3105j
    /* renamed from: a */
    public final InterfaceC3106k mo7439a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        C4088h c4088h = this.f18378a;
        return new C3508b(c4088h, c4088h.m8858e(typeToken));
    }

    @Override // i00.AbstractC3105j
    /* renamed from: b */
    public final InterfaceC3106k mo7440b(Type type, Annotation[] annotationArr, C0073l c0073l) {
        TypeToken<?> typeToken = TypeToken.get(type);
        C4088h c4088h = this.f18378a;
        return new C0927v(5, c4088h, c4088h.m8858e(typeToken), false);
    }
}
