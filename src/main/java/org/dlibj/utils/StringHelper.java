package org.dlibj;

import com.sun.jna.Pointer;

import org.dlibj.StdLib;

class StringHelper {

    public static String FromStdString(Pointer ptr)
    {
        return FromStdString(ptr, false);
    }

    public static String FromStdString(Pointer ptr, Boolean dispose)
    {
        // Need not to delete str
        // Because string.c_str returns inner memory of string instance.
        // This inner memory will be deleted when string instance is deleted.
        Pointer c_str_pointer = StdLib.DlibDotNetNative.INSTANCE.string_c_str(ptr);
        String ret = c_str_pointer.getString(0);
        if (dispose && ptr != Pointer.NULL)
            StdLib.DlibDotNetNative.INSTANCE.string_delete(ptr);
        return ret;
    }

}
