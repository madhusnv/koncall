package rf;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b2.C0554l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends Fragment implements InterfaceC6502g {

    /* renamed from: b */
    public static final WeakHashMap f31238b = new WeakHashMap();

    /* renamed from: a */
    public final C0554l f31239a = new C0554l((byte) 0, 8);

    @Override // rf.InterfaceC6502g
    /* renamed from: a */
    public final void mo12521a(DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m) {
        this.f31239a.m1646p(dialogInterfaceOnCancelListenerC6508m);
    }

    @Override // rf.InterfaceC6502g
    /* renamed from: b */
    public final DialogInterfaceOnCancelListenerC6508m mo12522b() {
        return (DialogInterfaceOnCancelListenerC6508m) DialogInterfaceOnCancelListenerC6508m.class.cast(((Map) this.f31239a.f3779c).get("ConnectionlessLifecycleHelper"));
    }

    @Override // rf.InterfaceC6502g
    /* renamed from: c */
    public final Activity mo12523c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f31239a.f3779c).values().iterator();
        while (it.hasNext()) {
            ((DialogInterfaceOnCancelListenerC6508m) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) throws PackageManager.NameNotFoundException {
        super.onActivityResult(i10, i11, intent);
        this.f31239a.m1648r(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31239a.m1649s(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0554l c0554l = this.f31239a;
        c0554l.f3778b = 5;
        Iterator it = ((Map) c0554l.f3779c).values().iterator();
        while (it.hasNext()) {
            ((DialogInterfaceOnCancelListenerC6508m) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0554l c0554l = this.f31239a;
        c0554l.f3778b = 3;
        Iterator it = ((Map) c0554l.f3779c).values().iterator();
        while (it.hasNext()) {
            ((DialogInterfaceOnCancelListenerC6508m) it.next()).m12528d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f31239a.m1650t(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0554l c0554l = this.f31239a;
        c0554l.f3778b = 2;
        for (DialogInterfaceOnCancelListenerC6508m dialogInterfaceOnCancelListenerC6508m : ((Map) c0554l.f3779c).values()) {
            dialogInterfaceOnCancelListenerC6508m.f31246b = true;
            dialogInterfaceOnCancelListenerC6508m.m12528d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C0554l c0554l = this.f31239a;
        c0554l.f3778b = 4;
        Iterator it = ((Map) c0554l.f3779c).values().iterator();
        while (it.hasNext()) {
            ((DialogInterfaceOnCancelListenerC6508m) it.next()).m12527c();
        }
    }
}
