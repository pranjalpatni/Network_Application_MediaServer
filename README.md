# Network_Application_MediaServer

This is a Java based team project. There are 3 entities as follows:

1- Renderer (where media will be played)- used VLC media player

2- Media Server- Contains the database of the media. The database contained specific movies of Jackie Chan, Bruce Lee and a few other movies.

3- Controller- It can simply be a laptop or in our case, we made an android application.

All the three entities will communicate together to perform the required job. The main objective of this project was the protocol designing part as to how the entities will communicate among themselves. For protocol designing, TCP connection using socket programming is used.

Here are the steps as to how the data would flow:

1- The controller establishes a TCP connection with the media server and requests for a movie by typing the name of the actor. For e.g- the user could type "jackie chan". This would display all the movies which has Jackie Chan in it. Similary, the user could also type "Bruce Lee", or simply "movies" to display the list of all the movies that are in the database. In the same way, the database also contains mp3 files. Hence, there is a search operation that is done at the media sever as per the request sent by the controller.

2- The media server would send the required list of the movies or the songs as desired by the controller.

3- The user would pick one of the media.

4- The controller then creates another TCP connection with the renderer and asks the renderer to play the corresponding movie/song.

5- The renderer then sends an HTTP request to the media server using TCP connection.

6- Upon receiving the request the media server would start streaming the media files to the renderer.

7- The controller has options of play, pause, stop, rewind and forward, to control the media.

Mongoose serever is used for implementing the media server.

LIMITATIONS:

1- The IP addresses of the devices must be known in advance and put into the code.

2- When requesting the media server for particular movie/songs, the name of the request should be very specific. Otherwise, the searching would fail and the connection won't be established.
