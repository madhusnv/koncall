package h6;

import android.os.Bundle;
import org.json.JSONObject;
import pg.AbstractC5927h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.w */
/* loaded from: classes.dex */
public final class C2867w extends AbstractC5927h {

    /* renamed from: a */
    public final String f15875a;

    public C2867w(String str, Bundle bundle) {
        this.f15875a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
