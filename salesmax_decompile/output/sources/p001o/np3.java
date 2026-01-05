package p001o;

import android.widget.CompoundButton;

/* loaded from: classes2.dex */
public abstract class np3 {

    /* renamed from: o.np3$a */
    public class C15626a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f37129a;

        /* renamed from: b */
        public final /* synthetic */ nv8 f37130b;

        public C15626a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, nv8 nv8Var) {
            this.f37129a = onCheckedChangeListener;
            this.f37130b = nv8Var;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f37129a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.f37130b.mo41180a();
        }
    }

    /* renamed from: a */
    public static void m40895a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    /* renamed from: b */
    public static void m40896b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, nv8 nv8Var) {
        if (nv8Var == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C15626a(onCheckedChangeListener, nv8Var));
        }
    }
}
