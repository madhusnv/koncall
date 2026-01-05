package p022x;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.e */
/* loaded from: classes.dex */
public class C8235e {

    /* renamed from: a */
    public final InputConfiguration f39375a;

    public C8235e(Object obj) {
        this.f39375a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8235e)) {
            return false;
        }
        return Objects.equals(this.f39375a, ((C8235e) obj).f39375a);
    }

    public final int hashCode() {
        return this.f39375a.hashCode();
    }

    public final String toString() {
        return this.f39375a.toString();
    }
}
