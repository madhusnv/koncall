package ai.salesmax.ui.home;

import ai.salesmax.MainActivity;
import ai.salesmax.ui.BaseFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.datastore.generated.model.User;
import com.google.android.material.textview.MaterialTextView;
import p001o.c64;
import p001o.h84;
import p001o.h9g;
import p001o.jgg;
import p001o.mii;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.rm1;
import p001o.sq8;
import p001o.u6e;
import p001o.uq8;
import p001o.wi0;
import p001o.wre;
import p001o.xca;
import p001o.xg7;
import p001o.y3i;
import p001o.yca;

/* loaded from: classes.dex */
public final class GetStartedFragment extends BaseFragment {

    /* renamed from: h */
    public xg7 f1510h;

    /* renamed from: ai.salesmax.ui.home.GetStartedFragment$a */
    public static final class C0607a extends jgg implements nl7 {

        /* renamed from: H */
        public final /* synthetic */ long f1511H;

        /* renamed from: L */
        public final /* synthetic */ long f1512L;

        /* renamed from: a */
        public Object f1513a;

        /* renamed from: b */
        public Object f1514b;

        /* renamed from: c */
        public Object f1515c;

        /* renamed from: d */
        public int f1516d;

        /* renamed from: e */
        public int f1517e;

        /* renamed from: f */
        public int f1518f;

        /* renamed from: g */
        public int f1519g;

        /* renamed from: h */
        public int f1520h;

        /* renamed from: q */
        public long f1521q;

        /* renamed from: s */
        public int f1522s;

        /* renamed from: x */
        public final /* synthetic */ String[] f1523x;

        /* renamed from: y */
        public final /* synthetic */ TextView f1524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0607a(String[] strArr, TextView textView, long j, long j2, n64 n64Var) {
            super(2, n64Var);
            this.f1523x = strArr;
            this.f1524y = textView;
            this.f1511H = j;
            this.f1512L = j2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C0607a(this.f1523x, this.f1524y, this.f1511H, this.f1512L, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c0 -> B:23:0x00c7). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            int length;
            C0607a c0607a;
            int i;
            String str;
            TextView textView;
            long j;
            int length2;
            C0607a c0607a2;
            String[] strArr2;
            int i2;
            long j2;
            Object objM51918f = uq8.m51918f();
            int i3 = this.f1522s;
            if (i3 == 0) {
                wre.m54934b(obj);
                strArr = this.f1523x;
                length = strArr.length;
                c0607a = this;
                i = 0;
                if (i < length) {
                }
            } else if (i3 == 1) {
                int i4 = this.f1520h;
                int i5 = this.f1519g;
                long j3 = this.f1521q;
                int i6 = this.f1518f;
                int i7 = this.f1517e;
                int i8 = this.f1516d;
                TextView textView2 = (TextView) this.f1515c;
                String str2 = (String) this.f1514b;
                String[] strArr3 = (String[]) this.f1513a;
                wre.m54934b(obj);
                c0607a2 = this;
                i = i8;
                strArr2 = strArr3;
                textView2.setText(h9g.l1(str2, i4 + 1));
                i2 = i5 + 1;
                length = i7;
                length2 = i6;
                j = j3;
                textView = textView2;
                str = str2;
                while (i2 < length2) {
                }
                j2 = c0607a2.f1511H;
                c0607a2.f1513a = strArr2;
                c0607a2.f1514b = null;
                c0607a2.f1515c = null;
                c0607a2.f1516d = i;
                c0607a2.f1517e = length;
                c0607a2.f1522s = 2;
                if (nk5.m40720b(j2, c0607a2) != objM51918f) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.f1517e;
                int i10 = this.f1516d;
                String[] strArr4 = (String[]) this.f1513a;
                wre.m54934b(obj);
                c0607a = this;
                int i11 = i9;
                strArr = strArr4;
                int i12 = i11;
                i = i10 + 1;
                length = i12;
                if (i < length) {
                    String str3 = strArr[i];
                    c0607a.f1524y.setText("");
                    length2 = str3.length();
                    j = c0607a.f1512L;
                    textView = c0607a.f1524y;
                    str = str3;
                    c0607a2 = c0607a;
                    strArr2 = strArr;
                    i2 = 0;
                    while (i2 < length2) {
                        c0607a2.f1513a = strArr2;
                        c0607a2.f1514b = str;
                        c0607a2.f1515c = textView;
                        c0607a2.f1516d = i;
                        c0607a2.f1517e = length;
                        c0607a2.f1518f = length2;
                        c0607a2.f1521q = j;
                        c0607a2.f1519g = i2;
                        c0607a2.f1520h = i2;
                        c0607a2.f1522s = 1;
                        if (nk5.m40720b(j, c0607a2) == objM51918f) {
                            return objM51918f;
                        }
                        String str4 = str;
                        TextView textView3 = textView;
                        long j4 = j;
                        int i13 = length2;
                        int i14 = length;
                        int i15 = i2;
                        textView3.setText(h9g.l1(str4, i2 + 1));
                        i2 = i15 + 1;
                        length = i14;
                        length2 = i13;
                        j = j4;
                        textView = textView3;
                        str = str4;
                    }
                    j2 = c0607a2.f1511H;
                    c0607a2.f1513a = strArr2;
                    c0607a2.f1514b = null;
                    c0607a2.f1515c = null;
                    c0607a2.f1516d = i;
                    c0607a2.f1517e = length;
                    c0607a2.f1522s = 2;
                    if (nk5.m40720b(j2, c0607a2) != objM51918f) {
                        return objM51918f;
                    }
                    strArr = strArr2;
                    c0607a = c0607a2;
                    int i16 = i;
                    i11 = length;
                    i10 = i16;
                    int i122 = i11;
                    i = i10 + 1;
                    length = i122;
                    if (i < length) {
                        return y3i.f54824a;
                    }
                }
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C0607a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sq8.m48649h(layoutInflater, "inflater");
        String hexString = Integer.toHexString(c64.getColor(requireContext(), u6e.superfone_white));
        sq8.m48648g(hexString, "toHexString(...)");
        String strSubstring = hexString.substring(2);
        sq8.m48648g(strSubstring, "substring(...)");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        sq8.m48647f(fragmentActivityRequireActivity, "null cannot be cast to non-null type ai.salesmax.MainActivity");
        ((MainActivity) fragmentActivityRequireActivity).s3(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strSubstring);
        if (this.f1510h == null) {
            this.f1510h = xg7.h0(layoutInflater, viewGroup, false);
        }
        View viewM25689B = p1().m25689B();
        sq8.m48648g(viewM25689B, "getRoot(...)");
        return viewM25689B;
    }

    @Override // ai.salesmax.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        User userM39171u;
        sq8.m48649h(view, "view");
        super.onViewCreated(view, bundle);
        mii miiVarM54444J = wi0.m54444J();
        String str = "Hi " + ((miiVarM54444J == null || (userM39171u = miiVarM54444J.m39171u()) == null) ? null : userM39171u.getName()) + " !! Welcome to Salesmax";
        MaterialTextView materialTextView = p1().q0;
        sq8.m48648g(materialTextView, "getStartedTitle");
        xca viewLifecycleOwner = getViewLifecycleOwner();
        sq8.m48648g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q1(materialTextView, viewLifecycleOwner, new String[]{str, "Let's Get you started"}, 50L, 2000L);
    }

    public final xg7 p1() {
        xg7 xg7Var = this.f1510h;
        sq8.m48646e(xg7Var);
        return xg7Var;
    }

    public final void q1(TextView textView, xca xcaVar, String[] strArr, long j, long j2) {
        rm1.m46952d(yca.m57521a(xcaVar), null, null, new C0607a(strArr, textView, j2, j, null), 3, null);
    }
}
