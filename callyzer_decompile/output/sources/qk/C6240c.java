package qk;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;
import kk.AbstractC4103w;
import kk.C4088h;
import kk.InterfaceC4104x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qk.c */
/* loaded from: classes.dex */
public class C6240c implements InterfaceC4104x {
    @Override // kk.InterfaceC4104x
    /* renamed from: a */
    public final AbstractC4103w mo8877a(C4088h c4088h, TypeToken typeToken) {
        if (typeToken.getRawType() == Timestamp.class) {
            return new C6241d(c4088h.m8858e(TypeToken.get(Date.class)));
        }
        return null;
    }
}
