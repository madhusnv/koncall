package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import p001o.ece;
import p001o.m3d;
import pub.devrel.easypermissions.AbstractC18784a;

/* renamed from: pub.devrel.easypermissions.c */
/* loaded from: classes6.dex */
public class DialogInterfaceOnClickListenerC18786c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public Object f57992a;

    /* renamed from: b */
    public ece f57993b;

    /* renamed from: c */
    public AbstractC18784a.a f57994c;

    /* renamed from: d */
    public AbstractC18784a.b f57995d;

    public DialogInterfaceOnClickListenerC18786c(RationaleDialogFragmentCompat rationaleDialogFragmentCompat, ece eceVar, AbstractC18784a.a aVar, AbstractC18784a.b bVar) {
        this.f57992a = rationaleDialogFragmentCompat.getParentFragment() != null ? rationaleDialogFragmentCompat.getParentFragment() : rationaleDialogFragmentCompat.getActivity();
        this.f57993b = eceVar;
        this.f57994c = aVar;
        this.f57995d = bVar;
    }

    /* renamed from: a */
    public final void m60224a() {
        AbstractC18784a.a aVar = this.f57994c;
        if (aVar != null) {
            ece eceVar = this.f57993b;
            aVar.mo33237a(eceVar.f21399d, Arrays.asList(eceVar.f21401f));
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ece eceVar = this.f57993b;
        int i2 = eceVar.f21399d;
        if (i != -1) {
            AbstractC18784a.b bVar = this.f57995d;
            if (bVar != null) {
                bVar.mo33238d(i2);
            }
            m60224a();
            return;
        }
        String[] strArr = eceVar.f21401f;
        AbstractC18784a.b bVar2 = this.f57995d;
        if (bVar2 != null) {
            bVar2.mo33239e(i2);
        }
        Object obj = this.f57992a;
        if (obj instanceof Fragment) {
            m3d.m38238e((Fragment) obj).mo37852a(i2, strArr);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            m3d.m38237d((Activity) obj).mo37852a(i2, strArr);
        }
    }

    public DialogInterfaceOnClickListenerC18786c(DialogFragmentC18787d dialogFragmentC18787d, ece eceVar, AbstractC18784a.a aVar, AbstractC18784a.b bVar) {
        this.f57992a = dialogFragmentC18787d.getActivity();
        this.f57993b = eceVar;
        this.f57994c = aVar;
        this.f57995d = bVar;
    }
}
