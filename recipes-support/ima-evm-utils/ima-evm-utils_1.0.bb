LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = " \
	http://sourceforge.net/projects/linux-ima/files/ima-evm-utils/ima-evm-utils-${PV}.tar.gz \
	file://0001-Don-t-build-man-pages.patch \
"

SRC_URI[md5sum] = "d0e4a4fb92b8fc7c22dfd092c50568ae"
SRC_URI[sha256sum] = "5701d98069311d0a84ffd67eba047cf46c591f93a55c382a449d10e930b85858"

DEPENDS = "openssl attr keyutils"

inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

