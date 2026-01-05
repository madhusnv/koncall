package h6;

import android.os.Bundle;
import pg.AbstractC5927h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h6.r */
/* loaded from: classes.dex */
public class C2862r extends AbstractC5927h {
    public C2862r(String str, Bundle bundle, int i10) {
        switch (i10) {
            case 1:
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("password should not be empty");
                }
                return;
            default:
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("type should not be empty");
                }
                return;
        }
    }
}
