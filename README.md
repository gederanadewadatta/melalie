# melalie
this is assessment test project to be backend engineer on pt.melalie

for api documentation please refer to http://ranadewadatta-melalie.herokuapp.com/swagger-ui.html
kindly find list of API Below with pattern:  (API_Method : API_URL : API_Name)



POST: /api/purchase : createPurchasing
GET: /api/restaurants : getAllRestaurant
GET: /api/restaurant/{id} :findRestaurantById
GET: /api/restaurant/operasional/{datetime} : findRestaurantByOperasionalHours
GET: /api/restaurant/customer/location/{location} : findRestaurantByCustLocation
GET: /api/restaurant/open/{datetimefrom}/{datetimeto} : findRestaurantByOpenFromAndOpenTo
GET: /api/restaurant/price/{priceFrom}/{priceFrom} : findRestaurantByPriceRange
GET: /api/restaurant/menu/{name} : findRestaurantOrDishByName
GET: /api/restaurant/menu/dish/{name} : findRestaurantByExactlyDishName
GET: /api/restaurant/customer/amount/{dateFrom}/{dateTo}/{maxcustomer} : findXUserBySpesificDate
GET: /api/restaurant/popular/ : getPopularRestaurant
