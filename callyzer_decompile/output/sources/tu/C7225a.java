package tu;

import com.websoptimization.callyzerbiz.R;
import i0.m0;
import java.util.List;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tu.a */
/* loaded from: classes3.dex */
public final class C7225a {

    /* renamed from: c */
    public static final List f34554c = pe.m10834i(new C7225a(R.drawable.icon_note_templates, R.string.call_note_templates), new C7225a(R.drawable.ic_message_template, R.string.message_templates), new C7225a(R.drawable.likn_device, R.string.linked_quick_call), new C7225a(R.drawable.ic_compare, R.string.compare), new C7225a(R.drawable.ic_settings, R.string.settings), new C7225a(R.drawable.ic_whats_new, R.string.whats_new), new C7225a(R.drawable.ic_contact_us, R.string.contact_us), new C7225a(R.drawable.ic_info, R.string.about_app));

    /* renamed from: a */
    public final int f34555a;

    /* renamed from: b */
    public final int f34556b;

    public C7225a(int i10, int i11) {
        this.f34555a = i10;
        this.f34556b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7225a)) {
            return false;
        }
        C7225a c7225a = (C7225a) obj;
        return this.f34555a == c7225a.f34555a && this.f34556b == c7225a.f34556b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34556b) + (Integer.hashCode(this.f34555a) * 31);
    }

    public final String toString() {
        return m0.m7377j(this.f34555a, this.f34556b, "MoreUiModel(icon=", ", name=", ")");
    }
}
