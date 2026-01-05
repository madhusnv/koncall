package p001o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.result.ActivityResult;
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

/* loaded from: classes2.dex */
public final class gd2 {

    /* renamed from: a */
    public final Fragment f24991a;

    /* renamed from: b */
    public final Integer f24992b;

    /* renamed from: c */
    public final int f24993c;

    /* renamed from: d */
    public String f24994d;

    /* renamed from: e */
    public Uri f24995e;

    /* renamed from: f */
    public InterfaceC13681a f24996f;

    /* renamed from: g */
    public final ws f24997g;

    /* renamed from: h */
    public final ws f24998h;

    /* renamed from: o.gd2$a */
    public interface InterfaceC13681a {
        /* renamed from: a */
        void mo1001a(Uri uri);

        /* renamed from: b */
        void mo1002b();

        /* renamed from: c */
        void mo1003c();
    }

    public gd2(Fragment fragment, Integer num) {
        sq8.m48649h(fragment, "fragment");
        this.f24991a = fragment;
        this.f24992b = num;
        this.f24993c = 101;
        ws wsVarRegisterForActivityResult = fragment.registerForActivityResult(new us(), new ns() { // from class: o.ed2
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) throws Throwable {
                gd2.m28462i(this.f21407a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f24997g = wsVarRegisterForActivityResult;
        ws wsVarRegisterForActivityResult2 = fragment.registerForActivityResult(new ss(), new ns() { // from class: o.fd2
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                gd2.m28461g(this.f23144a, (Map) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f24998h = wsVarRegisterForActivityResult2;
    }

    /* renamed from: g */
    public static final void m28461g(gd2 gd2Var, Map map) {
        sq8.m48649h(gd2Var, "this$0");
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
            gd2Var.m28467h();
            return;
        }
        InterfaceC13681a interfaceC13681a = gd2Var.f24996f;
        if (interfaceC13681a != null) {
            interfaceC13681a.mo1003c();
        }
    }

    /* renamed from: i */
    public static final void m28462i(gd2 gd2Var, ActivityResult activityResult) throws Throwable {
        sq8.m48649h(gd2Var, "this$0");
        if (activityResult.m3726b() != -1) {
            InterfaceC13681a interfaceC13681a = gd2Var.f24996f;
            if (interfaceC13681a != null) {
                interfaceC13681a.mo1002b();
                return;
            }
            return;
        }
        try {
            Integer num = gd2Var.f24992b;
            if (num != null) {
                gd2Var.m28463c(num.intValue());
            }
            InterfaceC13681a interfaceC13681a2 = gd2Var.f24996f;
            if (interfaceC13681a2 != null) {
                Uri uri = gd2Var.f24995e;
                sq8.m48646e(uri);
                interfaceC13681a2.mo1001a(uri);
            }
        } catch (Exception e) {
            e.printStackTrace();
            InterfaceC13681a interfaceC13681a3 = gd2Var.f24996f;
            if (interfaceC13681a3 != null) {
                interfaceC13681a3.mo1002b();
            }
        }
    }

    /* renamed from: c */
    public final void m28463c(int i) throws Throwable {
        File fileCreateTempFile;
        File file = new File(m28465e());
        if (file.exists()) {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(m28465e());
            Bitmap bitmapM28469k = bitmapDecodeFile != null ? m28469k(bitmapDecodeFile, m28465e()) : null;
            int i2 = 100;
            do {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapM28469k != null) {
                    bitmapM28469k.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Context context = this.f24991a.getContext();
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
                Context contextRequireContext = this.f24991a.requireContext();
                sq8.m48648g(contextRequireContext, "requireContext(...)");
                Uri uriFromFile = Uri.fromFile(fileCreateTempFile);
                if (!file.delete()) {
                    jm7.v0(this.f24991a.requireActivity(), "Could not delete original image", 0, 0, 12, null);
                    this.f24995e = uriFromFile;
                } else if (fileCreateTempFile.renameTo(file)) {
                    this.f24995e = FileProvider.m5839h(contextRequireContext, contextRequireContext.getPackageName() + ".provider", file);
                } else {
                    jm7.v0(this.f24991a.requireActivity(), "Could not rename to compressed file", 0, 0, 12, null);
                    this.f24995e = uriFromFile;
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

    /* renamed from: d */
    public final File m28464d() throws IOException {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        sq8.m48648g(str, "format(...)");
        Context context = this.f24991a.getContext();
        File fileCreateTempFile = File.createTempFile("JPEG_" + str + "_", ".jpg", context != null ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null);
        String absolutePath = fileCreateTempFile.getAbsolutePath();
        sq8.m48648g(absolutePath, "getAbsolutePath(...)");
        m28470l(absolutePath);
        sq8.m48648g(fileCreateTempFile, "apply(...)");
        return fileCreateTempFile;
    }

    /* renamed from: e */
    public final String m28465e() {
        String str = this.f24994d;
        if (str != null) {
            return str;
        }
        sq8.m48667z("currentPhotoPath");
        return null;
    }

    /* renamed from: f */
    public final void m28466f(InterfaceC13681a interfaceC13681a) {
        this.f24996f = interfaceC13681a;
        if (j4d.m33213T(this.f24991a.requireContext())) {
            m28467h();
            return;
        }
        ws wsVar = this.f24998h;
        List list = j4d.f29778J;
        sq8.m48648g(list, "IMPORT_IMAGE_WITH_CAMERA_PERMISSIONS");
        wsVar.m54945b(list.toArray(new String[0]));
    }

    /* renamed from: h */
    public final void m28467h() {
        File fileM28464d;
        Context context = this.f24991a.getContext();
        boolean z = false;
        if (context != null && j4d.m33213T(context)) {
            z = true;
        }
        if (!z) {
            InterfaceC13681a interfaceC13681a = this.f24996f;
            if (interfaceC13681a != null) {
                interfaceC13681a.mo1003c();
                return;
            }
            return;
        }
        if (!this.f24991a.isAdded() || this.f24991a.isDetached() || this.f24991a.requireActivity().isFinishing()) {
            InterfaceC13681a interfaceC13681a2 = this.f24996f;
            if (interfaceC13681a2 != null) {
                interfaceC13681a2.mo1002b();
                return;
            }
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.f24991a.requireContext().getPackageManager()) == null) {
            InterfaceC13681a interfaceC13681a3 = this.f24996f;
            if (interfaceC13681a3 != null) {
                interfaceC13681a3.mo1002b();
                return;
            }
            return;
        }
        try {
            fileM28464d = m28464d();
        } catch (IOException unused) {
            fileM28464d = null;
        }
        if (fileM28464d != null) {
            Uri uriM5839h = FileProvider.m5839h(this.f24991a.requireContext(), this.f24991a.requireContext().getPackageName() + ".provider", fileM28464d);
            this.f24995e = uriM5839h;
            intent.putExtra("output", uriM5839h);
            this.f24997g.m54945b(intent);
        }
    }

    /* renamed from: j */
    public final Bitmap m28468j(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        sq8.m48648g(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    /* renamed from: k */
    public final Bitmap m28469k(Bitmap bitmap, String str) {
        int iM32354i = new im6(str).m32354i("Orientation", 0);
        return iM32354i != 3 ? iM32354i != 6 ? iM32354i != 8 ? bitmap : m28468j(bitmap, 270.0f) : m28468j(bitmap, 90.0f) : m28468j(bitmap, 180.0f);
    }

    /* renamed from: l */
    public final void m28470l(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f24994d = str;
    }

    public /* synthetic */ gd2(Fragment fragment, Integer num, int i, id5 id5Var) {
        this(fragment, (i & 2) != 0 ? null : num);
    }
}
