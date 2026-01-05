package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c72 implements k76 {

    /* renamed from: a */
    public final boolean f17437a;

    /* renamed from: b */
    public final String f17438b;

    /* renamed from: c */
    public final int f17439c;

    /* renamed from: d */
    public final Map f17440d = new HashMap();

    /* renamed from: e */
    public final l5e f17441e;

    public c72(String str, l5e l5eVar) throws NumberFormatException {
        boolean z;
        int i;
        this.f17438b = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            wja.m54638l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.f17437a = z;
        this.f17439c = i;
        this.f17441e = l5eVar;
    }
}
