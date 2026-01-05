package p001o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.DialogInterfaceC1782a;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p001o.rs;

/* loaded from: classes2.dex */
public final class t3i {

    /* renamed from: a */
    public final Fragment f46326a;

    /* renamed from: b */
    public final EnumC16985b f46327b;

    /* renamed from: c */
    public final Integer f46328c;

    /* renamed from: d */
    public InterfaceC16984a f46329d;

    /* renamed from: e */
    public Uri f46330e;

    /* renamed from: f */
    public String f46331f;

    /* renamed from: g */
    public final ws f46332g;

    /* renamed from: h */
    public final ws f46333h;

    /* renamed from: i */
    public final ws f46334i;

    /* renamed from: o.t3i$a */
    public interface InterfaceC16984a {
        /* renamed from: a */
        void mo1836a(Uri uri);

        /* renamed from: b */
        void mo1837b();

        /* renamed from: c */
        void mo1838c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.t3i$b */
    public static final class EnumC16985b {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC16985b[] $VALUES;
        public static final EnumC16985b CAMERA = new EnumC16985b("CAMERA", 0);
        public static final EnumC16985b GALLERY = new EnumC16985b("GALLERY", 1);
        public static final EnumC16985b BOTH = new EnumC16985b("BOTH", 2);

        private static final /* synthetic */ EnumC16985b[] $values() {
            return new EnumC16985b[]{CAMERA, GALLERY, BOTH};
        }

        static {
            EnumC16985b[] enumC16985bArr$values = $values();
            $VALUES = enumC16985bArr$values;
            $ENTRIES = hi6.m30609a(enumC16985bArr$values);
        }

        private EnumC16985b(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC16985b valueOf(String str) {
            return (EnumC16985b) Enum.valueOf(EnumC16985b.class, str);
        }

        public static EnumC16985b[] values() {
            return (EnumC16985b[]) $VALUES.clone();
        }
    }

    /* renamed from: o.t3i$c */
    public /* synthetic */ class C16986c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46335a;

        static {
            int[] iArr = new int[EnumC16985b.values().length];
            try {
                iArr[EnumC16985b.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16985b.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16985b.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46335a = iArr;
        }
    }

    public t3i(Fragment fragment, EnumC16985b enumC16985b, Integer num) {
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(enumC16985b, "mode");
        this.f46326a = fragment;
        this.f46327b = enumC16985b;
        this.f46328c = num;
        ws wsVarRegisterForActivityResult = fragment.registerForActivityResult(new rs(), new ns() { // from class: o.o3i
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                t3i.m49259j(this.f37699a, (Uri) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f46332g = wsVarRegisterForActivityResult;
        ws wsVarRegisterForActivityResult2 = fragment.registerForActivityResult(new us(), new ns() { // from class: o.p3i
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) throws Throwable {
                t3i.m49258f(this.f39290a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f46333h = wsVarRegisterForActivityResult2;
        ws wsVarRegisterForActivityResult3 = fragment.registerForActivityResult(new ss(), new ns() { // from class: o.q3i
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                t3i.m49260l(this.f41269a, (Map) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult3, "registerForActivityResult(...)");
        this.f46334i = wsVarRegisterForActivityResult3;
    }

    /* renamed from: f */
    public static final void m49258f(t3i t3iVar, ActivityResult activityResult) throws Throwable {
        sq8.m48649h(t3iVar, "this$0");
        if (activityResult.m3726b() != -1) {
            InterfaceC16984a interfaceC16984a = t3iVar.f46329d;
            if (interfaceC16984a != null) {
                interfaceC16984a.mo1837b();
                return;
            }
            return;
        }
        try {
            Integer num = t3iVar.f46328c;
            if (num != null) {
                t3iVar.m49264h(num.intValue());
            }
            InterfaceC16984a interfaceC16984a2 = t3iVar.f46329d;
            if (interfaceC16984a2 != null) {
                Uri uri = t3iVar.f46330e;
                sq8.m48646e(uri);
                interfaceC16984a2.mo1836a(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
            InterfaceC16984a interfaceC16984a3 = t3iVar.f46329d;
            if (interfaceC16984a3 != null) {
                interfaceC16984a3.mo1837b();
            }
        }
    }

    /* renamed from: j */
    public static final void m49259j(t3i t3iVar, Uri uri) {
        sq8.m48649h(t3iVar, "this$0");
        if (uri != null) {
            InterfaceC16984a interfaceC16984a = t3iVar.f46329d;
            if (interfaceC16984a != null) {
                interfaceC16984a.mo1836a(uri);
                return;
            }
            return;
        }
        InterfaceC16984a interfaceC16984a2 = t3iVar.f46329d;
        if (interfaceC16984a2 != null) {
            interfaceC16984a2.mo1837b();
        }
    }

    /* renamed from: l */
    public static final void m49260l(t3i t3iVar, Map map) {
        sq8.m48649h(t3iVar, "this$0");
        Set setEntrySet = map.entrySet();
        boolean z = true;
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator it = setEntrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            t3iVar.m49267m();
            return;
        }
        InterfaceC16984a interfaceC16984a = t3iVar.f46329d;
        if (interfaceC16984a != null) {
            interfaceC16984a.mo1838c();
        }
    }

    /* renamed from: r */
    public static final void m49261r(t3i t3iVar, DialogInterface dialogInterface, int i) {
        sq8.m48649h(t3iVar, "this$0");
        if (i == 0) {
            t3iVar.m49263g();
        } else {
            if (i != 1) {
                return;
            }
            t3iVar.m49268n();
        }
    }

    /* renamed from: s */
    public static final void m49262s(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* renamed from: g */
    public final void m49263g() {
        if (j4d.m33213T(this.f46326a.requireContext())) {
            m49267m();
            return;
        }
        ws wsVar = this.f46334i;
        List list = j4d.f29778J;
        sq8.m48648g(list, "IMPORT_IMAGE_WITH_CAMERA_PERMISSIONS");
        wsVar.m54945b(list.toArray(new String[0]));
    }

    /* renamed from: h */
    public final void m49264h(int i) throws Throwable {
        File fileCreateTempFile;
        String str = this.f46331f;
        if (str == null) {
            sq8.m48667z("currentPhotoPath");
            str = null;
        }
        File file = new File(str);
        if (file.exists()) {
            String str2 = this.f46331f;
            if (str2 == null) {
                sq8.m48667z("currentPhotoPath");
                str2 = null;
            }
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2);
            if (bitmapDecodeFile != null) {
                String str3 = this.f46331f;
                if (str3 == null) {
                    sq8.m48667z("currentPhotoPath");
                    str3 = null;
                }
                Bitmap bitmapM49270p = m49270p(bitmapDecodeFile, str3);
                if (bitmapM49270p == null) {
                    return;
                }
                int i2 = 100;
                do {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapM49270p.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Context context = this.f46326a.getContext();
                    fileCreateTempFile = File.createTempFile("COMPRESSED_", ".jpg", context != null ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null);
                    sq8.m48648g(fileCreateTempFile, "createTempFile(...)");
                    sq8.m48646e(byteArray);
                    yz6.m58556f(fileCreateTempFile, byteArray);
                    byteArrayOutputStream.close();
                    i2 -= 10;
                    if (fileCreateTempFile.length() <= i) {
                        break;
                    }
                } while (i2 > 10);
                if (fileCreateTempFile.exists()) {
                    Context contextRequireContext = this.f46326a.requireContext();
                    sq8.m48648g(contextRequireContext, "requireContext(...)");
                    Uri uriFromFile = Uri.fromFile(fileCreateTempFile);
                    if (file.delete() && fileCreateTempFile.renameTo(file)) {
                        this.f46330e = FileProvider.m5839h(contextRequireContext, contextRequireContext.getPackageName() + ".provider", file);
                    } else {
                        this.f46330e = uriFromFile;
                    }
                }
                try {
                    im6 im6Var = new im6(file.getAbsolutePath());
                    im6Var.c0("Orientation", "1");
                    im6Var.m32344X();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: i */
    public final File m49265i() throws IOException {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        Context context = this.f46326a.getContext();
        File fileCreateTempFile = File.createTempFile("JPEG_" + str + "_", ".jpg", context != null ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null);
        String absolutePath = fileCreateTempFile.getAbsolutePath();
        sq8.m48648g(absolutePath, "getAbsolutePath(...)");
        this.f46331f = absolutePath;
        sq8.m48648g(fileCreateTempFile, "apply(...)");
        return fileCreateTempFile;
    }

    /* renamed from: k */
    public final void m49266k(InterfaceC16984a interfaceC16984a) {
        sq8.m48649h(interfaceC16984a, "fileListener");
        this.f46329d = interfaceC16984a;
        int i = C16986c.f46335a[this.f46327b.ordinal()];
        if (i == 1) {
            m49268n();
        } else if (i == 2) {
            m49263g();
        } else {
            if (i != 3) {
                return;
            }
            m49271q();
        }
    }

    /* renamed from: m */
    public final void m49267m() {
        File fileM49265i;
        if (!this.f46326a.isAdded() || this.f46326a.isDetached() || this.f46326a.requireActivity().isFinishing()) {
            InterfaceC16984a interfaceC16984a = this.f46329d;
            if (interfaceC16984a != null) {
                interfaceC16984a.mo1837b();
                return;
            }
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.f46326a.requireContext().getPackageManager()) == null) {
            InterfaceC16984a interfaceC16984a2 = this.f46329d;
            if (interfaceC16984a2 != null) {
                interfaceC16984a2.mo1837b();
                return;
            }
            return;
        }
        try {
            fileM49265i = m49265i();
        } catch (IOException unused) {
            fileM49265i = null;
        }
        if (fileM49265i == null) {
            InterfaceC16984a interfaceC16984a3 = this.f46329d;
            if (interfaceC16984a3 != null) {
                interfaceC16984a3.mo1837b();
                return;
            }
            return;
        }
        Uri uriM5839h = FileProvider.m5839h(this.f46326a.requireContext(), this.f46326a.requireContext().getPackageName() + ".provider", fileM49265i);
        this.f46330e = uriM5839h;
        intent.putExtra("output", uriM5839h);
        this.f46333h.m54945b(intent);
    }

    /* renamed from: n */
    public final void m49268n() {
        this.f46332g.m54945b(r7d.m46309a(rs.C16657c.f43995a));
    }

    /* renamed from: o */
    public final Bitmap m49269o(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        sq8.m48648g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* renamed from: p */
    public final Bitmap m49270p(Bitmap bitmap, String str) {
        int iM32354i = new im6(str).m32354i("Orientation", 0);
        return iM32354i != 3 ? iM32354i != 6 ? iM32354i != 8 ? bitmap : m49269o(bitmap, 270.0f) : m49269o(bitmap, 90.0f) : m49269o(bitmap, 180.0f);
    }

    /* renamed from: q */
    public final void m49271q() {
        new DialogInterfaceC1782a.a(this.f46326a.requireContext()).setTitle("Select Source").mo3872e(new String[]{"Camera", "Gallery"}, new DialogInterface.OnClickListener() { // from class: o.r3i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                t3i.m49261r(this.f42901a, dialogInterface, i);
            }
        }).mo3874g("Cancel", new DialogInterface.OnClickListener() { // from class: o.s3i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                t3i.m49262s(dialogInterface, i);
            }
        }).m3880m();
    }

    public /* synthetic */ t3i(Fragment fragment, EnumC16985b enumC16985b, Integer num, int i, id5 id5Var) {
        this(fragment, (i & 2) != 0 ? EnumC16985b.BOTH : enumC16985b, (i & 4) != 0 ? null : num);
    }
}
