package p001o;

import android.content.Intent;
import com.facebook.C10773c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e32 implements d32 {

    /* renamed from: b */
    public static final C13089b f20849b = new C13089b(null);

    /* renamed from: c */
    public static final Map f20850c = new HashMap();

    /* renamed from: a */
    public final Map f20851a = new HashMap();

    /* renamed from: o.e32$a */
    public interface InterfaceC13088a {
        /* renamed from: a */
        boolean mo24164a(int i, Intent intent);
    }

    /* renamed from: o.e32$b */
    public static final class C13089b {
        public C13089b() {
        }

        public /* synthetic */ C13089b(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final synchronized InterfaceC13088a m24166b(int i) {
            return (InterfaceC13088a) e32.f20850c.get(Integer.valueOf(i));
        }

        /* renamed from: c */
        public final synchronized void m24167c(int i, InterfaceC13088a interfaceC13088a) {
            sq8.m48649h(interfaceC13088a, "callback");
            if (e32.f20850c.containsKey(Integer.valueOf(i))) {
                return;
            }
            e32.f20850c.put(Integer.valueOf(i), interfaceC13088a);
        }

        /* renamed from: d */
        public final boolean m24168d(int i, int i2, Intent intent) {
            InterfaceC13088a interfaceC13088aM24166b = m24166b(i);
            if (interfaceC13088aM24166b != null) {
                return interfaceC13088aM24166b.mo24164a(i2, intent);
            }
            return false;
        }
    }

    /* renamed from: o.e32$c */
    public enum EnumC13090c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        EnumC13090c(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            return C10773c.m13025r() + this.offset;
        }
    }

    @Override // p001o.d32
    /* renamed from: a */
    public boolean mo22293a(int i, int i2, Intent intent) {
        InterfaceC13088a interfaceC13088a = (InterfaceC13088a) this.f20851a.get(Integer.valueOf(i));
        return interfaceC13088a != null ? interfaceC13088a.mo24164a(i2, intent) : f20849b.m24168d(i, i2, intent);
    }

    /* renamed from: c */
    public final void m24163c(int i, InterfaceC13088a interfaceC13088a) {
        sq8.m48649h(interfaceC13088a, "callback");
        this.f20851a.put(Integer.valueOf(i), interfaceC13088a);
    }
}
