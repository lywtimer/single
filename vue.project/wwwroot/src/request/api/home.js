import service from "@/request";
export function getBanner(){
    return service({
        method:'GET',
        url:"/banner?type=2"
    })
}

export function getPersonalized(limit=10){
    return service({
        method:'GET',
        url:"/personalized?limit=" + limit
    })
}