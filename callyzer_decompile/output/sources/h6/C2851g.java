package h6;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.g */
/* loaded from: classes.dex */
public final class C2851g extends AbstractC2847c {

    /* renamed from: a */
    public final String f15861a;

    public C2851g(String str, Bundle bundle) {
        this.f15861a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}
