include resin-beaglebone.inc

IMAGE_FEATURES_append = "debug-tweaks \
			"
IMAGE_INSTALL_append = "dropbear nano htop vpn-init-staging beaglebone-supervisor-init-staging beaglebone-resin-supervisor-master \
			"
