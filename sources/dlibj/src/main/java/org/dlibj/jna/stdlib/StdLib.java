package org.dlibj;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

class StdLib {

    public interface DlibDotNetNative extends Library {
        DlibDotNetNative INSTANCE = (DlibDotNetNative) Native.loadLibrary("DlibDotNetNative", DlibDotNetNative.class);

        Pointer string_c_str(Pointer str);
        void string_delete(Pointer str);
    }

}
