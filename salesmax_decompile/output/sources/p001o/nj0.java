package p001o;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes6.dex */
public class nj0 extends pe1 {
    public nj0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // p001o.m3d
    /* renamed from: a */
    public void mo37852a(int i, String... strArr) {
        mn.m39367g((Activity) m38239c(), strArr, i);
    }

    @Override // p001o.m3d
    /* renamed from: b */
    public Context mo37853b() {
        return (Context) m38239c();
    }

    @Override // p001o.m3d
    /* renamed from: i */
    public boolean mo37854i(String str) {
        return mn.m39371k((Activity) m38239c(), str);
    }

    @Override // p001o.pe1
    /* renamed from: m */
    public FragmentManager mo40672m() {
        return ((AppCompatActivity) m38239c()).getSupportFragmentManager();
    }
}
