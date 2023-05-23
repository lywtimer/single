
yum install certbot python2-certbot-nginx -y
certbot --nginx -d music.liyutong180220.top -d api.liyutong180220.top

ssl_certificate     /etc/letsencrypt/live/music.liyutong180220.top/fullchain.pem;  # 证书文件
ssl_certificate_key /etc/letsencrypt/live/music.liyutong180220.top/privkey.pem;   # 私钥文件

