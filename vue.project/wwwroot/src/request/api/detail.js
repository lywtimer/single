import service from "@/request";

export function getPlaylistDetail(id){
    return service({
        method:'GET',
        url:"/playlist/detail?id=" + id
    })
}