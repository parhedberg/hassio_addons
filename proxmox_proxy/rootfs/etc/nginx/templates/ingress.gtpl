server {
    listen 8006 default_server;

    include /etc/nginx/includes/server_params.conf;

    location / {
        allow   all;

        proxy_pass https://backend;
        proxy_set_header X-Ingress-Path {{ .entry }};
        include /etc/nginx/includes/proxy_params.conf;
    }
}
