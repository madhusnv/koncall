package b00;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6666p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.x */
/* loaded from: classes3.dex */
public class C0539x extends AbstractC0532q {
    @Override // b00.AbstractC0532q
    /* renamed from: A */
    public final List mo1600A(a0 a0Var) throws IOException {
        File file = a0Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + a0Var);
            }
            throw new FileNotFoundException("no such file: " + a0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC4154l.m8920c(str);
            arrayList.add(a0Var.m1519d(str));
        }
        AbstractC6666p.m12770t(arrayList);
        return arrayList;
    }

    @Override // b00.AbstractC0532q
    /* renamed from: J */
    public C0531p mo1601J(a0 path) {
        AbstractC4154l.m8923f(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C0531p(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: P */
    public final C0538w mo1602P(a0 a0Var) {
        return new C0538w(new RandomAccessFile(a0Var.toFile(), "r"));
    }

    @Override // b00.AbstractC0532q
    /* renamed from: R */
    public final h0 mo1603R(a0 file) {
        AbstractC4154l.m8923f(file, "file");
        return AbstractC0517b.m1527f(file.toFile(), false);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: S */
    public final i0 mo1604S(a0 file) {
        AbstractC4154l.m8923f(file, "file");
        return new C0520e(new FileInputStream(file.toFile()), k0.f3639d);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: h */
    public final h0 mo1605h(a0 file) {
        AbstractC4154l.m8923f(file, "file");
        return AbstractC0517b.m1527f(file.toFile(), true);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: j */
    public void mo1606j(a0 source, a0 target) throws IOException {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // b00.AbstractC0532q
    /* renamed from: n */
    public final void mo1607n(a0 dir) throws IOException {
        AbstractC4154l.m8923f(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C0531p c0531pMo1601J = mo1601J(dir);
        if (c0531pMo1601J == null || !c0531pMo1601J.f3656c) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // b00.AbstractC0532q
    /* renamed from: u */
    public final void mo1608u(a0 path) throws IOException {
        AbstractC4154l.m8923f(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }
}
