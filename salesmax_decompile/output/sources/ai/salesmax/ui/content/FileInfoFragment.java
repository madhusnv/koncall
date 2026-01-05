package ai.salesmax.ui.content;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import p001o.id5;
import p001o.p9e;
import p001o.sq8;

/* loaded from: classes.dex */
public final class FileInfoFragment extends Fragment {

    /* renamed from: c */
    public static final C0347a f631c = new C0347a(null);

    /* renamed from: d */
    public static final int f632d = 8;

    /* renamed from: a */
    public String f633a;

    /* renamed from: b */
    public String f634b;

    /* renamed from: ai.salesmax.ui.content.FileInfoFragment$a */
    public static final class C0347a {
        public C0347a() {
        }

        public /* synthetic */ C0347a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final FileInfoFragment m833a(String str) {
            sq8.m48649h(str, "param1");
            FileInfoFragment fileInfoFragment = new FileInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param1", str);
            fileInfoFragment.setArguments(bundle);
            return fileInfoFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f633a = arguments.getString("param1");
            this.f634b = arguments.getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        return layoutInflater.inflate(p9e.fragment_file_info, viewGroup, false);
    }
}
