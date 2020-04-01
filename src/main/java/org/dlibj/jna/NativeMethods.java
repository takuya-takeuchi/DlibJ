package org.dlibj;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

class NativeMethods {

    public interface DlibDotNetNative extends Library {
        DlibDotNetNative INSTANCE = (DlibDotNetNative) Native.loadLibrary("DlibDotNetNative", DlibDotNetNative.class);

        Pointer get_version();
    }

}
