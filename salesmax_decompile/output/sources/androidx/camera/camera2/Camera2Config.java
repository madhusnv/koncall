package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import p001o.b72;
import p001o.d9i;
import p001o.f72;
import p001o.fb2;
import p001o.li8;
import p001o.m92;
import p001o.q92;
import p001o.va2;

/* loaded from: classes2.dex */
public abstract class Camera2Config {

    public static final class DefaultProvider implements fb2.InterfaceC13380b {
        @Override // p001o.fb2.InterfaceC13380b
        public fb2 getCameraXConfig() {
            return Camera2Config.m4518c();
        }
    }

    /* renamed from: c */
    public static fb2 m4518c() {
        q92.InterfaceC16325a interfaceC16325a = new q92.InterfaceC16325a() { // from class: o.y62
            @Override // p001o.q92.InterfaceC16325a
            /* renamed from: a */
            public final q92 mo45031a(Context context, ua2 ua2Var, oa2 oa2Var, long j) {
                return new p42(context, ua2Var, oa2Var, j);
            }
        };
        m92.InterfaceC15254a interfaceC15254a = new m92.InterfaceC15254a() { // from class: o.z62
            @Override // p001o.m92.InterfaceC15254a
            /* renamed from: a */
            public final m92 mo38581a(Context context, Object obj, Set set) {
                return Camera2Config.m4519d(context, obj, set);
            }
        };
        return new fb2.C13379a().m26360c(interfaceC16325a).m26361d(interfaceC15254a).m26364g(new d9i.InterfaceC12849c() { // from class: o.a72
            @Override // p001o.d9i.InterfaceC12849c
            /* renamed from: a */
            public final d9i mo16535a(Context context) {
                return Camera2Config.m4520e(context);
            }
        }).m26358a();
    }

    /* renamed from: d */
    public static /* synthetic */ m92 m4519d(Context context, Object obj, Set set) throws li8 {
        try {
            return new b72(context, obj, set);
        } catch (va2 e) {
            throw new li8(e);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ d9i m4520e(Context context) {
        return new f72(context);
    }
}
