package b00;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.AbstractC4154l;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.y */
/* loaded from: classes3.dex */
public final class C0540y extends C0539x {
    /* renamed from: U */
    public static Long m1627U(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // b00.C0539x, b00.AbstractC0532q
    /* renamed from: J */
    public final C0531p mo1601J(a0 path) throws IOException {
        a0 a0VarM16037m;
        AbstractC4154l.m8923f(path, "path");
        Path pathM1520e = path.m1520e();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM1520e, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM1520e) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = a0.f3585b;
                a0VarM16037m = C8687a.m16037m(symbolicLink.toString());
            } else {
                a0VarM16037m = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM1627U = fileTimeCreationTime != null ? m1627U(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM1627U2 = fileTimeLastModifiedTime != null ? m1627U(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C0531p(zIsRegularFile, zIsDirectory, a0VarM16037m, lValueOf, lM1627U, lM1627U2, fileTimeLastAccessTime != null ? m1627U(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // b00.C0539x, b00.AbstractC0532q
    /* renamed from: j */
    public final void mo1606j(a0 source, a0 target) throws IOException {
        AbstractC4154l.m8923f(source, "source");
        AbstractC4154l.m8923f(target, "target");
        try {
            Files.move(source.m1520e(), target.m1520e(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // b00.C0539x
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
