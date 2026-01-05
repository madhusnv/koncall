package p001o;

import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j28 extends h28 {

    /* renamed from: d */
    public final int f29628d;

    /* renamed from: e */
    public final String f29629e;

    /* renamed from: f */
    public final Map f29630f;

    /* renamed from: g */
    public final byte[] f29631g;

    public j28(int i, String str, IOException iOException, Map map, iz4 iz4Var, byte[] bArr) {
        super("Response code: " + i, iOException, iz4Var, CastStatusCodes.APPLICATION_NOT_FOUND, 1);
        this.f29628d = i;
        this.f29629e = str;
        this.f29630f = map;
        this.f29631g = bArr;
    }
}
