package g00;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g00.b */
/* loaded from: classes3.dex */
public final class C2417b {

    /* renamed from: a */
    public final String f10910a;

    /* renamed from: b */
    public final Object f10911b;

    public C2417b(String str, Object obj) {
        this.f10910a = str;
        this.f10911b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2417b.class == obj.getClass()) {
            C2417b c2417b = (C2417b) obj;
            if (Objects.equals(this.f10910a, c2417b.f10910a) && Objects.equals(this.f10911b, c2417b.f10911b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10910a, this.f10911b);
    }

    public final String toString() {
        return String.valueOf(this.f10910a) + "=\"" + String.valueOf(this.f10911b) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }
}
